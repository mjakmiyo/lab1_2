package main.java.pl.com.bottega.ecommerce.sales.domain.invoicing;

import main.java.pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public class FoodTaxFactory implements TaxFactory {

    @Override
    public Tax calculate(Money net) {
        BigDecimal ratio = BigDecimal.valueOf(0.07);
        String desc = "7% (F)";
        Money taxValue = net.multiplyBy(ratio);
        return new Tax(taxValue, desc);
    }
}
