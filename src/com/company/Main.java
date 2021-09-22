package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human("Kuba", "Bog", 3);
        Pet cat = new Pet("Brytyjski", 20.0, "Kitku", null);
        FarmAnimal cow = new FarmAnimal("limousine", 150.0, "Krówka", null);
        Car clio = new Disel("Clio", "Reanult", 2010, 15000.0, me);
        Phone phone = new Phone("Samsung", "Galaxy s21+", 2021, 4500.0, 6.7, "Android");
        Phone phone2 = new Phone("Apple", "Iphone 12", 2020, 4000.0, 6.1, "iOS");
        Human random = new Human("Natan", "Bąk");
        Car civic = new LPG("Honda", "Civic", 2005, 5000.0, me);
        Car tesla = new Electric("Tesla", "X", 2021, 200000.0, me);
        random.cash = 20000.0;
        clio.value = 15000.0;
        me.pet = cat;
        me.cash = 10000.0;
        me.mobilePhone = phone;
        random.mobilePhone = phone2;


        cat.feed();
        /*cat.feed();
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


        Car civic = new LPG("Honda", "Civic", 2005, 5000.0, me);
        Car tesla = new Electric("Tesla", "X", 2021, 200000.0, me);
        clio.refuel();
        civic.refuel();
        tesla.refuel();

        me.setSalary(3000.0);
        me.cash = 15000.0;
        me.addCar(clio);
        me.addCar(civic);
        me.addCar(tesla);

        System.out.println(me.getGarageValue());
        System.out.println(me.sortGarage());

        civic.sell(me, random, 1900.0);
        System.out.println(me);
        System.out.println(me);*/


        Application Chrome = new Application("Google Chrome", "91.0.4472.77", 0.0);
        Application Wolt = new Application("Wolt", "4.5.1", 0.0);
        Application Game = new Application("Game Dev Tycoon", "1.4.7", 24.0);
        Application Minecraft = new Application("Minecraft", "1.14.0.3", 34.0);

        phone.installAnApp(me, Chrome);
        phone.installAnApp(me, Wolt);
        phone.installAnApp(me, Minecraft);

        System.out.println(phone.hasApplication("Chrome"));
        System.out.println(phone.hasApplication(Chrome));
        System.out.println(phone.hasApplication(Game));
        System.out.println(phone.hasApplication("Game Dev Tycoon"));

        phone.showAllApplications();
        phone.showAllFreeApplications();
        phone.sortApplicationsByName();
        phone.sortApplicationsByPrice();

        phone.installAnApp(random, Game);
        System.out.println(phone2.hasApplication(Game));


    }
}