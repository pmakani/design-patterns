package org.owltech.structural.proxy;

public class ProxyExample {
    public static void main(String[] args) {
        User authorizedUser = new UserProxyHandler(true).getUser();
        authorizedUser.checkout();

        User guestUser = new UserProxyHandler(false).getUser();
        guestUser.checkout();
    }
}
