package org.owltech.structural.decorator;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("BasicCar assemble");
    }
}
