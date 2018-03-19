package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class TaxPolicy {
    public Tax calculateTax(Money taxValue, String desc){
        return new Tax(taxValue, desc);
    }
}
