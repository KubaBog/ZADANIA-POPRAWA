package com.company.devices;

public class LPG extends Car {
    public LPG(String producer, String model, int yearOfProduction, double value) {
        super(producer, model, yearOfProduction, value);
    }


    @Override
    public void refuel() {
        System.out.println("Natankowano: " + producer + model + "(LPG)");
    }
}
