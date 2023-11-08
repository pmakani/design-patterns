package org.owltech.behavioral.template;

public abstract class PhoneOrder {
    final void createOrder() {
        //series of method invocation
        selectProduct();
        packProduct();
        makePayment();
        deliverProduct();
    }

    abstract void selectProduct();

    abstract void makePayment();

    void packProduct() {
        System.out.println("paking the product");
    }

    abstract void deliverProduct();
}
