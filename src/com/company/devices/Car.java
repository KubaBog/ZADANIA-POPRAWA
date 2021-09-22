package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device {
    public String color;
    public Double mileage;
    public Double value;
    public int horsepower;

    public Car(String producer, String model, int yearOfProduction, double value) {
        super(producer, model, yearOfProduction);
        this.value = value;
        super(producer, model, yearOfProduction, value);
    }



   /* public String toString() {
        return producer + " " + model + " " + yearOfProduction + "" +
                doors + " " + mileage + " " + horsepower + " " + color + " " +
                engineVolume + " " + value;
    }*/

    @Override
    public void turnOn() {
        System.out.println("Samochód jest włączony");
    }

    public abstract void refuel();

    public String toString() {
        return "\nCar {\n" +
                "   producer = '" + producer + '\'' +
                ",\n   model = '" + model + '\'' +
                ",\n   yearOfProduction = " + yearOfProduction +
                ",\n   horsepower = " + horsepower +
                ",\n   color = " + color +
                ",\n   value = " + value +
                "\n}\n";
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)) {
            throw new Exception("Sprzedający nie posiada tego samochodu!");
        }

        if (!buyer.hasFreeSpace()) {
            throw new Exception("Kupujący nie ma miejsca w swoim garażu!");
        }

        if (buyer.cash < price) {
            throw new Exception("Kupujący nie ma tylu pieniędzy!");
        }
        seller.removeCar(this);
        buyer.addCar(this);

        seller.cash += price;
        buyer.cash -= price;

        System.out.println("Sprzedano!");
    }

}
