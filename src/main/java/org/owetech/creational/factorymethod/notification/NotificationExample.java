package org.owetech.creational.factorymethod.notification;

public class NotificationExample {
    public static void main(String[] args) {
        Notification email = NotificationFactory.create(NotificationType.EMAIL);
        email.send();

        Notification sms = NotificationFactory.create(NotificationType.SMS);
        sms.send();

        Notification push = NotificationFactory.create(NotificationType.PUSH);
        push.send();
    }
}
