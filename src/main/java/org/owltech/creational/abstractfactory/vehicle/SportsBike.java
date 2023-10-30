package org.owltech.creational.abstractfactory.vehicle;

public class SportsBike extends Bike {

    public SportsBike() {

    }

    @Override
    public void setVehicleType() {
        this.bikeType = "Sports";
    }

    @Override
    public void setBaseCost() {
        this.baseCost = 40;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 15;
    }
}
