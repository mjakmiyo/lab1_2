package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class InvoiceFactory implements IInvoiceFactory {
    public Invoice createInvoice(ClientData client){
        return Invoice.make(Id.generate(), client);
    }
}
