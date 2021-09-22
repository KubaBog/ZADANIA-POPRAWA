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

        Car clio = new Car("Clio", "Renault");
        Car clio = new Car("Clio", "Renault", 5);
        clio.color = "gray";
        clio.millage = 200000.0;
        clio.mileage = 200000.0;
        clio.engineVolume = 1.2;
        clio.value = 15000.0;

        Car clio2 = new Car("Clio", "Renault", 5);
        clio2.color = "gray";
        clio2.mileage = 200000.0;
        clio2.engineVolume = 1.2;
        clio2.value = 15000.0;
        clio2.horsepower = 102;


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

        dog.takeForAWalk();
        System.out.println("Obecna waga: " + dog.weight);

        dog.takeForAWalk();
        dog.feed();

        me.setSalary(1000.0);
        me.getSalary();

        System.out.println("Auto: " + clio.producer + " " + clio.model);
        me.setCar(clio);

        System.out.println(" == : " + (clio == clio2));
        System.out.println(" overrided equals() : " + clio.equals(clio2));

        System.out.println(clio);
        System.out.println(clio2);

        Phone phone = new Phone("Samsung", "Galaxy S21+", 6.7, "Android");

        System.out.println("Car: " + clio);
        System.out.println("Phone: " + phone);


    }
}
