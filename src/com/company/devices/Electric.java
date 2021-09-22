package com.company.devices;

public class Electric extends Car {

    public Electric(String producer, String model, int yearOfProduction, double value) {
        super(producer, model, yearOfProduction, value);
    }


    @Override
    public void refuel() {
        System.out.println("Naładowano: " + producer + model);
    }
}
