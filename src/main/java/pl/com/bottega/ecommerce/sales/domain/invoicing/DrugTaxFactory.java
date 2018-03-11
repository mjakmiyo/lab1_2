package main.java.pl.com.bottega.ecommerce.sales.domain.invoicing;

import main.java.pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public class DrugTaxFactory implements TaxFactory{

    @Override
    public Tax calculate(Money net){
        BigDecimal ratio = BigDecimal.valueOf(0.05);
        String desc = "5% (D)";
        Money taxValue = net.multiplyBy(ratio);
        return new Tax(taxValue, desc);
    }
}
