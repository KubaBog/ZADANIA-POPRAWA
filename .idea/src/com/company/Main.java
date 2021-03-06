package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Kuba";
        me.lastName = "Bog";

        Animal dog = new Animal();
        dog.name = "Tramp";
        dog.species = "Jack Russell terrier";
        dog.weight = 10.0;

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
    }
}
