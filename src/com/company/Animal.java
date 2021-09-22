package com.company;

import java.io.File;

public class Animal implements salleable {
    String species;
    Double weight;
    String name;
    File pic;

    void feed() {
        try {
            if (this.weight <= 0.0) {
                throw new Exception("Zwierzę " + this.name + " nie może jeść, bo nie umarło.");
            } else {
                this.weight += 1.0;
                System.out.println("Zwierzę " + this.name + " zostało nakarmione.");
            }
        } catch (Exception feedEx) {
            System.err.println(feedEx);
        }
    }

    void takeForAWalk() {
        try {
            if (this.weight == 0.0) {
                throw new Exception("Zwierzę " + this.name + " już umarło.");
            } else {
                System.out.println("Zwierzę " + this.name + " zostało wyprowadzone na spacer.");

                if (this.weight <= 1.0) {
                    this.weight = 0.0;
                    System.out.println("Zwierzę " + this.name + " podczas spaceru wychudziło się i powoli umiera.");
                } else {
                    this.weight -= 1.0;
                }
            }
        } catch (Exception walkEx) {
            System.err.println(walkEx);
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != this) {
            System.out.println("Nie możesz sprzedawać kradzionego zwierzęcia!");
        } else if (buyer.cash < price) {
            System.out.println("Kupujący nie ma tylu pieniędzy");
        } else if (seller == buyer) {
            System.out.println("Nie możesz sprzedać zwierzęcia sobie samemu!");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Udało się sprzedać zwierzęcie za " + price);
        }
    }
}