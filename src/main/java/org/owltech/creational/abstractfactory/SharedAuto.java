package org.owltech.creational.abstractfactory;

public class SharedAuto extends Auto {

    public SharedAuto() {
    }


    @Override
    public void setVehicleType() {
        this.shareType = "Shared";
    }

    @Override
    public void setBaseCost() {
        this.baseCost = 0;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.chargesPerUnitDistance = 10;
    }
}
