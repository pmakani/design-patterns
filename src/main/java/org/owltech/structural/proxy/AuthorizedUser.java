package org.owltech.structural.proxy;

public class AuthorizedUser implements User {
    @Override
    public void checkout() {
        System.out.println("AuthorizedUser checkout");
    }
}
