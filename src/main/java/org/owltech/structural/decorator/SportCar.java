package org.owltech.structural.decorator;

public class SportCar extends CarDecorator {
    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        System.out.println("SportCar Assemble");
    }
}
