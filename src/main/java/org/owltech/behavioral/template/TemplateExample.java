package org.owltech.behavioral.template;

public class TemplateExample {
    public static void main(String[] args) {
        PhoneOrder offlineStore = new OfflineStore();

        PhoneOrder onlineStore = new OnlineStore();
        onlineStore.createOrder();
    }
}
