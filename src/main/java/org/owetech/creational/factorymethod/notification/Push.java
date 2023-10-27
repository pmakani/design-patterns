package org.owetech.creational.factorymethod.notification;

public class Push implements Notification {
    @Override
    public void send() {
        System.out.println("Push has been sent");
    }
}
