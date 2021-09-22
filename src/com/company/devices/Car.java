package com.company.devices;


public class Car extends Device {
    public String color;
    public Double mileage;
    public Double engineVolume;
    public Double value;
    public int doors;
    public int horsepower;

    public Car(String producer, String model, int yearOfProduction, int doors) {
        super(producer, model, yearOfProduction);
        this.doors = doors;
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction + "" +
                doors + " " + mileage + " " + horsepower + " " + color + " " +
                engineVolume + " " + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return doors == car.doors &&
                model.equals(car.model) &&
                mileage.equals(car.mileage) &&
                color.equals(car.color) &&
                engineVolume.equals(car.engineVolume) &&
                value.equals(car.value) &&
                producer.equals(car.producer);
    }

    @Override
    public int hashCode() {
        return doors;
    }

    @Override
    public void turnOn() {
        System.out.println("Samochód jest włączony");
    }
}