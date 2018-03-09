/*
 * Copyright 2011-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

class Payment {
	private static volatile Payment INSTANCE=null;
    private static ClientData clientData;
    private static Money amount;
    private static Id aggregateId;
    
    public static Payment getInstance(Id aggregateId, ClientData clientData, Money amount) {
    			if(INSTANCE==null) {
    					INSTANCE = new Payment(aggregateId, clientData,amount);
    	}
		return INSTANCE;
    }

    private Payment(Id aggregateId, ClientData clientData, Money amount) {
        Payment.aggregateId = aggregateId;
        Payment.clientData = clientData;
        Payment.amount = amount;
    }
    public Payment rollBack() {
    	setAmount(getAmount().multiplyBy(-1));
    	return this;
    	
    }
	public static Money getAmount() {
		return amount;
	}

	public static void setAmount(Money amount) {
		Payment.amount = amount;
	} 
}
