package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Kuba";
        me.lastName = "Bog";

        Animal dog = new Animal();
        dog.name = "Tramp";
        dog.species = "Jack Russell terrier";
        dog.weight = 10.0;

        Car clio = new Car("Clio", "Renault", 2010, 5);
        clio.color = "gray";
        clio.mileage = 200000.0;
        clio.engineVolume = 1.2;
        clio.value = 15000.0;

        Car clio2 = new Car("Clio", "Renault", 2010, 5);
        clio2.color = "gray";
        clio2.mileage = 200000.0;
        clio2.engineVolume = 1.2;
        clio2.value = 15000.0;
        clio2.horsepower = 102;

        Human me = new Human("Kuba", "Bog");
        Pet cat = new Pet("Brytyjski", 20.0, "Kitku", null);
        FarmAnimal cow = new FarmAnimal("limousine", 150.0, "Krówka", null);
        Car clio = new Car("Clio", "Reanult", 2010, 5);
        Phone phone = new Phone("Samsung", "Galaxy s21+", 2021, 6.7, "Android");
        me.pet = cat;
        clio.value = 15000.0;

        me.pet = dog;

        dog.takeForAWalk();
        dog.feed();

        //me.setCar(clio);

        phone.turnOn();
        clio.turnOn();

        me.mobilePhone = phone;
        me.cash = 40.0;

        Human sister = new Human();
        sister.cash = 1000.0;

        phone.sell(me, me, 200.0);
        phone.sell(sister, me, 300.0);
        phone.sell(me, sister, 8000.0);
        phone.sell(me, sister, 500.0);


        Human slave = new Human();
        slave.sell(me, sister, 1000.0);

        dog.sell(me, sister, 1000.0);

        clio.sell(me, sister, 10000.0);

        cat.feed();
        cow.feed();

        cat.takeForAWalk();
        cow.beEaten();
        cow.beEaten();
    }
}