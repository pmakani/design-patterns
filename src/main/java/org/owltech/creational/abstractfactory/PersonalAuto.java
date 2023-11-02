package org.owltech.creational.abstractfactory;

public class PersonalAuto extends Auto {

    public PersonalAuto() {
    }

    @Override
    public void setVehicleType() {
        this.shareType = "Personal";
    }

    @Override
    public void setBaseCost() {
        this.baseCost = 10;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.chargesPerUnitDistance = 15;
    }
}
