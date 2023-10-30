package org.owltech.creational.abstractfactory.vehicle;

public class MicroCar extends Car {
    public MicroCar() {
    }

    @Override
    public void setVehicleType() {
        this.carType = "Micro";
    }

    @Override
    public void setBaseCost() {
        this.baseCost = 50;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.chargesPerUnitDistance = 10;
    }
}
