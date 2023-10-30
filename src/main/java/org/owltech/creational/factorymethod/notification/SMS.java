package org.owltech.creational.factorymethod.notification;

public class SMS implements Notification {
    @Override
    public void send() {
        System.out.println("SMS has been sent");
    }
}
