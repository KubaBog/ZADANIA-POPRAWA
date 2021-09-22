package com.company.devices;
import com.company.Human;
import com.company.salleable;

public class Phone extends Device {
public class Phone extends Device implements salleable {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.mobilePhone != this) {
            System.out.println("Nie możesz sprzedać kradzionego telefonu");
        } else if (buyer.cash < price) {
            System.out.println("Kupujący nie ma tylu pieniędzy");
        } else if (seller == buyer) {
            System.out.println("Nie możesz sprzedać telefonu sobie samemu");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.mobilePhone = seller.mobilePhone;
            seller.mobilePhone = null;
            System.out.println("Udało się sprzedać telefon za " + price);
        }
    }
}