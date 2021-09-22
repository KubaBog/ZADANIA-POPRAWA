package com.company.creatures;

import java.io.File;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String species, Double weight, String name, File pic) {
        super(species, weight, name, pic);
    }

    @Override
    public void beEaten() {
        try {
            if (this.weight <= 0.0) {
                throw new Exception("Zwierzę " + this.name + " nie żyje i waży 0, więc nie ma co jeść");
            } else {
                this.weight = 0.0;
                System.out.println("Zwierzę " + this.name + " zostało zabite i zjedzone");
            }

        } catch (Exception feedEx) {
            System.err.println(feedEx);
        }
    }

    @Override
    public void feed() {
        try {
            if (this.weight <= 0.0) {
                throw new Exception("Zwierzę " + this.name + " nie żyję, wiec nie może jeść");
            } else {
                this.weight += 1.0;
                System.out.println("Zwierzę " + this.name + " zostało nakarmione");
            }

        } catch (Exception feedEx) {
            System.err.println(feedEx);
        }
    }

    @Override
    public void feed(Double foodWeight) {
        try {
            if (this.weight <= 0.0) {
                throw new Exception("Zwierzę " + this.name + " nie żyję, wiec nie może jeść");
            } else {
                this.weight += foodWeight;
                System.out.println("Zwierzę " + this.name + " zostało nakarmione (+" + foodWeight + ")");
            }

        } catch (Exception feedEx) {
            System.err.println(feedEx);
        }
    }

    @Override
    public void takeForAWalk() {
        try {
            if (this.weight == 0.0) {
                throw new Exception("Zwierzę " + this.name + " umarło");
            } else {
                System.out.println("Zwierzę " + this.name + " zostało wyprowadzone na spacer");

                if (this.weight <= 1.0) {
                    this.weight = 0.0;
                    System.out.println("Zwierzę " + this.name + " podczas spaceru się wychodziło i właśnie zaczyna umierać");
                } else {
                    this.weight -= 1.0;
                }
            }

        } catch (Exception walkEx) {
            System.err.println(walkEx);
        }
    }
}
