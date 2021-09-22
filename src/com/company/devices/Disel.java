package com.company.devices;

public class Disel extends Car {

    public Disel(String producer, String model, int yearOfProduction, double value) {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Natankowano: " + producer + model + "(Disel)");
    }
}