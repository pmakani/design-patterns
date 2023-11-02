package org.owltech.creational.abstractfactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        int distance = 100;

        AbstractVehicleFactory carFactory = FactoryProvider.getVehicleFactory("Car");
        Vehicle car = carFactory.getVehicle("Micro");
        car.book(distance);

        AbstractVehicleFactory autoFactory = FactoryProvider.getVehicleFactory("Auto");
        Vehicle auto = autoFactory.getVehicle("Personal");
        auto.book(distance);

        AbstractVehicleFactory bikeFactory = FactoryProvider.getVehicleFactory("Bike");
        Vehicle bike = bikeFactory.getVehicle("Sports");
        bike.book(distance);
    }
}
