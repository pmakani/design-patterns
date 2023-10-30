package org.owltech.creational.factorymethod.notification;

public final class NotificationFactory {
    public static Notification create(NotificationType type) {
        Notification notification;
        switch (type) {
            case EMAIL:
                notification = new Email();
                break;
            case SMS:
                notification = new SMS();
                break;
            case PUSH:
                notification = new Push();
                break;
            default:
                throw new IllegalArgumentException("Notification Type Not Found");
        }
        return notification;
    }
}
