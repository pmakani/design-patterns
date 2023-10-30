package org.owltech.creational.abstractfactory.vehicle;

public class CarFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        Vehicle vehicle;
        switch (type) {
            case "Micro":
                vehicle = new MicroCar();
                break;
            case "Mini":
                vehicle = new MiniCar();
                break;
            case "Mega":
                vehicle = new MegaCar();
                break;
            default:
                throw new IllegalArgumentException("Invalid Car Type");
        }
        return vehicle;
    }
}
