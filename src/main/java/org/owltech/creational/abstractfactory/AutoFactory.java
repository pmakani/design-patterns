package org.owltech.creational.abstractfactory;

public class AutoFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        Vehicle vehicle;
        switch (type) {
            case "Personal":
                vehicle = new PersonalAuto();
                break;
            case "Shared":
                vehicle = new SharedAuto();
                break;
            default:
                throw new IllegalArgumentException("Invalid Auto Type");
        }
        return vehicle;
    }
}
