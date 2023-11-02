package org.owltech.creational.abstractfactory;

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
