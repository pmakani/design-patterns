package org.owltech.creational.abstractfactory;

public class NormalBike extends Bike {
    public NormalBike() {
    }

    @Override
    public void setVehicleType() {
        this.bikeType = "Normal";
    }

    @Override
    public void setBaseCost() {
        baseCost = 20;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 5;
    }
}
