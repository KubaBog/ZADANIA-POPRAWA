package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Human me = new Human("Kuba", "Bog");
        Pet cat = new Pet("Brytyjski", 20.0, "Kitku", null);
        FarmAnimal cow = new FarmAnimal("limousine", 150.0, "Krówka", null);
        Car clio = new Car("Clio", "Reanult", 2010, 5);
        Car clio = new Disel("Clio", "Reanult", 2010, 15000.0);
        Phone phone = new Phone("Samsung", "Galaxy s21+", 2021, 6.7, "Android");
        me.pet = cat;
        clio.value = 15000.0;

        cat.feed();
        cow.feed();

        cat.takeForAWalk();
        cow.beEaten();
        cow.beEaten();

        phone.installAnApp("YouTube");
        phone.installAnApp("YouTube", "16.20.35");
        phone.installAnApp("YouTube", "16.20.35", "youtube.appstore.com");


        List<String> appNames = new ArrayList<>();
        appNames.add("Twitch");
        appNames.add("Netflix");
        appNames.add("Discord");

        phone.installAnApp(appNames);


        Car civic = new LPG("Honda", "Civic", 2005, 5000.0);
        Car tesla = new Electric("Tesla", "X", 2021, 200000.0);
        clio.refuel();
        civic.refuel();
        tesla.refuel();

    }
}