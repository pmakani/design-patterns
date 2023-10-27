package org.owetech.creational.factorymethod.notification;

public class Email implements Notification {
    @Override
    public void send() {
        System.out.println("Email has been sent");
    }
}
