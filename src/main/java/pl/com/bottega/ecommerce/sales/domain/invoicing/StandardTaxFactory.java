package main.java.pl.com.bottega.ecommerce.sales.domain.invoicing;

import main.java.pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public class StandardTaxFactory implements TaxFactory {

    @Override
    public Tax calculate(Money net) {
        BigDecimal ratio = BigDecimal.valueOf(0.23);
        String desc = "23%";
        Money taxValue = net.multiplyBy(ratio);
        return new Tax(taxValue, desc);
    }
}
