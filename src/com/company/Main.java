package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    public static void main(String[] args) throws Exception {

        Human me = new Human("Kuba", "Bog");
        Human me = new Human("Kuba", "Bog", 3);
        Pet cat = new Pet("Brytyjski", 20.0, "Kitku", null);
        FarmAnimal cow = new FarmAnimal("limousine", 150.0, "Krówka", null);
        Car clio = new Disel("Clio", "Reanult", 2010, 15000.0);
        Phone phone = new Phone("Samsung", "Galaxy s21+", 2021, 6.7, "Android");
        me.pet = cat;
        Phone phone = new Phone("Samsung", "Galaxy s21+", 2021, 4500.0, 6.7, "Android");
        Human random = new Human("Natan", "Bąk");
        random.cash = 20000.0;
        clio.value = 15000.0;
        me.pet = cat;


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

        me.setSalary(3000.0);
        me.cash = 15000.0;
        me.setCar(clio, 0);
        me.setCar(civic, 1);
        me.setCar(tesla, 2);

        System.out.println(me.getGarageValue());
        System.out.println(me.sortGarage());

        civic.sell(me, random, 1900.0);
        System.out.println(me);

    }
}