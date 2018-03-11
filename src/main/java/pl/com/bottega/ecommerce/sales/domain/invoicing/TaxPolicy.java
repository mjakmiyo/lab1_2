package main.java.pl.com.bottega.ecommerce.sales.domain.invoicing;

import main.java.pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import main.java.pl.com.bottega.ecommerce.sharedkernel.Money;

public class TaxPolicy {

    public Tax calculate(Money net, ProductType type) {
        switch (type) {
            case DRUG:
                return new DrugTaxFactory().calculate(net);
            case FOOD:
                return new FoodTaxFactory().calculate(net);
            case STANDARD:
                return new StandardTaxFactory().calculate(net);

            default:
                throw new IllegalArgumentException(type + " not handled");
        }
    }
}
