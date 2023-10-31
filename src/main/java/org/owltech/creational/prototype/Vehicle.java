package org.owltech.creational.prototype;

import java.util.Objects;

public abstract class Vehicle {
    protected int seats;
    protected int tyres;
    protected String color;
    protected String fuel;

    public Vehicle() {

    }

    public Vehicle(Vehicle vehicle) {
        if (!Objects.isNull(vehicle)) {
            this.seats = vehicle.seats;
            this.tyres = vehicle.tyres;
            this.color = vehicle.color;
            this.fuel = vehicle.fuel;
        }
    }

    public abstract Vehicle clone();

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vehicle{");
        sb.append("seats=").append(seats);
        sb.append(", tyres=").append(tyres);
        sb.append(", color='").append(color).append('\'');
        sb.append(", fuel='").append(fuel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
