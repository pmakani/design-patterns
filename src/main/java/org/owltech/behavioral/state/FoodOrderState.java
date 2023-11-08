package org.owltech.behavioral.state;

public interface FoodOrderState {
    void transitionToNext(FoodOrder order);

    void showStatus();
}
