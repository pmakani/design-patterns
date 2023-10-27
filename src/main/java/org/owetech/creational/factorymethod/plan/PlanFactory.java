package org.owetech.creational.factorymethod.plan;

public class PlanFactory {
    public static Plan create(String planType) {
        Plan plan;
        switch (planType) {
            case "DOMESTIC":
                plan = new Domestic();
                break;
            case "COMMERCIAL":
                plan = new Commercial();
                break;
            case "INSTITUTIONAL":
                plan = new Institutional();
                break;
            default:
                throw new IllegalArgumentException("Plan Type not found");
        }
        return plan;
    }
}
