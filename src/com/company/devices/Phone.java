package com.company.devices;

public class Phone {
    final String producer;
    final String model;
public class Phone extends Device {
    final Double screenSize;
    final String operatingSystem;

    public Phone(String producer, String model, Double screenSize, String operatingSystem) {
        this.producer = producer;
        this.model = model;
    public Phone(String producer, String model, int yearOfProduction, Double screenSize, String operatingSystem) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    public String toString() {
        return producer + " " + model + " " + screenSize + " " + operatingSystem;
    }
}
