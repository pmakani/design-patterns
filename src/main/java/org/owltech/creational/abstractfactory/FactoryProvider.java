package org.owltech.creational.abstractfactory;

public final class FactoryProvider {
    public static AbstractVehicleFactory getVehicleFactory(String type) {
        AbstractVehicleFactory factory;
        switch (type) {
            case "Car":
                factory = new CarFactory();
                break;
            case "Auto":
                factory = new AutoFactory();
                break;
            case "Bike":
                factory = new BikeFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid Factory Type");
        }
        return factory;
    }
}
