package org.owltech.creational.prototype;

public class Bike extends Vehicle {

    public Bike() {

    }

    public Bike(Bike bike) {
        super(bike);
    }

    @Override
    public Vehicle clone() {
        return new Bike(this);
    }
}
