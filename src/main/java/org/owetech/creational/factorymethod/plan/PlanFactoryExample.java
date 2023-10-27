package org.owetech.creational.factorymethod.plan;

public class PlanFactoryExample {
    public static void main(String[] args) {
        Plan domestic = PlanFactory.create("DOMESTIC");
        domestic.calculateBill(10);
        domestic.getRate();
    }
}
