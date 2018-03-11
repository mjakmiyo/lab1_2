package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

interface TaxFactory {
    Tax calculate(Money net);
}
