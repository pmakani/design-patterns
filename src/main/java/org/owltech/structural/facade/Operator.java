package org.owltech.structural.facade;

public class Operator {
    private PlaceOrder order;
    private Payment payment;
    private Delivery delivery;

    public Operator() {
        order = new PlaceOrder();
        payment = new Payment();
        delivery = new Delivery();
    }

    public void completeOrder() {
        order.orderStatus();
        payment.paymentStatus();
        delivery.deliverStatus();
    }
}
