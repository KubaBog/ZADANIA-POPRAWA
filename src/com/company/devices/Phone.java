package com.company.devices;

public class Phone extends Device {
    final Double screenSize;
    final String operatingSystem;

    public Phone(String producer, String model, int yearOfProduction, Double screenSize, String operatingSystem) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    public String toString() {
        return producer + " " + model + " " + screenSize + " " + operatingSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon jest włączony");
    }
}