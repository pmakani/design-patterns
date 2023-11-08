package org.owltech.behavioral.template;

public class OfflineStore extends PhoneOrder {
    public OfflineStore() {

    }

    @Override
    void selectProduct() {
        System.out.println("selecting the product in offline store");
    }

    @Override
    void makePayment() {
        System.out.println("making the payment in offline store");
    }

    @Override
    void deliverProduct() {
        System.out.println("product deliverd in hands in offline store");
    }
}
