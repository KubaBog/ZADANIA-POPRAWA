package com.company.devices;
import com.company.creatures.Human;

public class Electric extends Car {

    public Electric(String producer, String model, int yearOfProduction, double value) {
        super(producer, model, yearOfProduction, value);
    public Electric(String producer, String model, int yearOfProduction, double value, Human owner) {
        super(producer, model, yearOfProduction, value, owner);
    }


    @Override
    public void refuel() {
        System.out.println("Naładowano: " + producer + model);
    }
}