package main.java.pl.com.bottega.ecommerce.sales.domain.invoicing;

import main.java.pl.com.bottega.ecommerce.sharedkernel.Money;

interface TaxFactory {
    Tax calculate(Money net);
}
