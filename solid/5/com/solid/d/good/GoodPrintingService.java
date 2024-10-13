package com.solid.d.good;

import com.solid.i.ComplexInvoice;
import com.solid.i.Invoice;
import com.solid.i.good.GoodInvoicePrinter;
import com.solid.i.good.GoodInvoicePrinter_I;

public class GoodPrintingService implements GoodInvoicePrinter_I {

    private GoodInvoicePrinter_I goodInvoicePrinter;

    public GoodPrintingService(GoodInvoicePrinter_I goodInvoicePrinter){
        this.goodInvoicePrinter=goodInvoicePrinter;
    }

    @Override
    public void print(Invoice invoice) {

    }

    @Override
    public void printComplexInvoice(ComplexInvoice complexInvoice) {

    }

    //print
}
