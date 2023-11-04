package org.owltech.structural.proxy;

public class GuestUser implements User {
    @Override
    public void checkout() {
        System.out.println("GuestUser checkout");
    }
}
