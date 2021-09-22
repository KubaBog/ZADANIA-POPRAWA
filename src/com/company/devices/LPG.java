package com.company.devices;
import com.company.creatures.Human;

public class LPG extends Car {
    public LPG(String producer, String model, int yearOfProduction, double value) {
        super(producer, model, yearOfProduction, value);
    public LPG(String producer, String model, int yearOfProduction, double value, Human owner) {
        super(producer, model, yearOfProduction, value, owner);
    }


    @Override
    public void refuel() {
        System.out.println("Natankowano: " + producer + model + "(LPG)");
    }
}
