package org.owltech.creational.abstractfactory.vehicle;

public class BikeFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        Vehicle vehicle;
        switch (type) {
            case "Sports":
                vehicle = new SportsBike();
                break;
            case "Normal":
                vehicle = new NormalBike();
                break;
            default:
                throw new IllegalArgumentException("Invalid Bike Type");
        }
        return vehicle;
    }
}
