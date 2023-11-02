package org.owltech.creational.abstractfactory;

public class MiniCar extends Car {

    public MiniCar() {

    }

    @Override
    public void setVehicleType() {
        this.carType = "Mini";
    }

    @Override
    public void setBaseCost() {
        this.baseCost = 100;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.chargesPerUnitDistance = 20;
    }
}
