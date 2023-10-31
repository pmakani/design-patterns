package org.owltech.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeExample {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle> vehiclesCopy = new ArrayList<>();

        Bike bike = new Bike();
        bike.seats = 1;
        bike.tyres = 2;
        bike.color = "Black";
        bike.fuel = "Petrol";

        Car car = new Car();
        car.seats = 5;
        car.tyres = 4;
        car.color = "White";
        car.fuel = "Petrol";

        vehicles.add(bike);
        vehicles.add(car);

        for(Vehicle vehicle: vehicles) {
            vehiclesCopy.add(vehicle.clone());
        }

        vehicles.forEach(vehicle -> System.out.println(vehicle));

        vehiclesCopy.forEach(vehicle -> System.out.println(vehicle));
    }
}
