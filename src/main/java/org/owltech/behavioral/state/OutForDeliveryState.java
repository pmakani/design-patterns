package org.owltech.behavioral.state;

public class OutForDeliveryState implements FoodOrderState {

    @Override
    public void transitionToNext(FoodOrder order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void showStatus() {
        System.out.println("Food picked and out for delivery, waiting for food to be delivered.");
    }
}
