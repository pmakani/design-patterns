package org.owltech.creational.abstractfactory.vehicle;

public class MegaCar extends Car {
    public MegaCar() {

    }

    @Override
    public void setVehicleType() {
        this.carType = "Mega";
    }

    @Override
    public void setBaseCost() {
        this.baseCost = 150;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.chargesPerUnitDistance = 30;
    }
}
