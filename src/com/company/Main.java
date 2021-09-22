package com.company;
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

        Phone phone = new Phone("Samsung", "Galaxy s21+", 2021, 6.7, "Android");

        me.pet = dog;

        System.out.println(me.firstName);
        System.out.println(me.pet.name);

        System.out.println("Imię zwierzęcia: " + dog.name);
        System.out.println("Obecna waga: " + dog.weight);

        dog.feed();
        System.out.println("Obecna waga: " + dog.weight);

        dog.takeForAWalk();
        System.out.println("Obecna waga: " + dog.weight);

        dog.takeForAWalk();
        System.out.println("Obecna waga: " + dog.weight);

        dog.takeForAWalk();
        System.out.println("Obecna waga: " + dog.weight);
        dog.feed();

        dog.takeForAWalk();
        System.out.println("Obecna waga: " + dog.weight);
        //me.setCar(clio);

        dog.takeForAWalk();
        dog.feed();
        phone.turnOn();
        clio.turnOn();

        me.setSalary(1000.0);
        me.getSalary();
        me.mobilePhone = phone;
        me.cash = 40.0;

        me.setCar(clio);
        Human sister = new Human();
        sister.cash = 1000.0;

        System.out.println(" == : " + (clio == clio2));
        System.out.println(" overrided equals() : " + clio.equals(clio2));
        phone.sell(me, me, 200.0);
        phone.sell(sister, me, 300.0);
        phone.sell(me, sister, 8000.0);
        phone.sell(me, sister, 500.0);

        System.out.println(clio);
        System.out.println(clio2);

        Phone phone = new Phone("Samsung", "Galaxy S21+", 2021, 6.7, "Android");
        Human slave = new Human();
        slave.sell(me, sister, 1000.0);

        System.out.println("Car: " + clio);
        System.out.println("Phone: " + phone);
        dog.sell(me, sister, 1000.0);

        phone.turnOn();
        clio.turnOn();
        clio.sell(me, sister, 10000.0);


    }
