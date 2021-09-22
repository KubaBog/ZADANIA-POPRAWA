package com.company.devices;

import com.company.creatures.Human;

import java.util.LinkedList;

public abstract class Car extends Device {
    public String color;
    public Double mileage;
    public Double value;
    public int horsepower;
    public LinkedList<Human> owners;

    public Car(String producer, String model, int yearOfProduction, double value) {
    public Car(String producer, String model, int yearOfProduction, double value, Human owner) {
        super(producer, model, yearOfProduction, value);
        this.owners = new LinkedList<Human>();
        this.owners.add(owner);
    }

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
        if (this.owners.getLast() != seller) {
            throw new Exception("Sprzedający nie jest ostatnim właścicielem pojazdu");
        }
        seller.removeCar(this);
        buyer.addCar(this);

        seller.cash += price;
        buyer.cash -= price;
        this.owners.add(buyer);

        System.out.println("Sprzedano!");
    }

    public boolean wasAnOwner(Human person) {
        for (Human owner :
                this.owners) {
            if (person == owner) {
                return true;
            }
        }
        return false;
    }

    public boolean didAselltoB(Human seller, Human buyer) {
        for (int i = 0; i < this.owners.size() - 1; i++) {
            if (this.owners.get(i) == seller) {
                if (this.owners.get(i + 1) == buyer) {
                    return true;
                }
            }
        }
        return false;
    }

    public int howManyTransactions() {
        return this.owners.size() - 1;
    }

}
