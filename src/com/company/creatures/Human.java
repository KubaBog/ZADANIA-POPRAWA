package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;
import com.company.salleable;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Human implements salleable {
    public final String firstName;
    public final String lastName;
    public Pet pet;
    public Phone mobilePhone;
    public Car[] garage;
    private Double salary;
    public Double cash;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[3];
    }

    public Human(String firstName, String lastName, int garageCapacity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[garageCapacity];
    }

    public Car getCar(int slotID) {
        return this.garage[slotID];
    }

    public void setCar(Car car, int slotID) {
        this.garage[slotID] = car;
    }

    public void takeCar(int slotID) {
        this.garage[slotID] = null;
    }

    public Double getGarageValue() {
        Double garageValue = 0.0;

        for (Device vehicle : this.garage) {
            garageValue += vehicle.value;
        }

        return garageValue;
    }

    public List<Car> sortGarage() {
        return Arrays.stream(garage)
                .sorted(Comparator.comparing(car -> car.yearOfProduction))
                .collect(Collectors.toList());
    }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) return true;
        }
        return false;
    }

    public boolean hasFreeSpace() {
        for (Car car : garage) {
            if (car == null) return true;
        }
        return false;
    }

    public void removeCar(Car carToRemove) {
        for (int i = 0; i < garage.length; i++) {
            if (this.garage[i] == carToRemove) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car newCar) {
        for (int i = 0; i < garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = newCar;
                newCar.owners.add(this);

                return;
            }
        }
    }

    @Override
    public String toString() {
        return "\nHuman {\n" +
                "   firstName = '" + firstName + '\'' +
                ",\n   lastName = '" + lastName + '\'' +
                ",\n   pet = " + pet +
                ",\n   phone = " + mobilePhone +
                ",\n   garage = " + Arrays.toString(garage) +
                ",\n   salary = " + salary +
                ",\n   cash = " + cash +
                "\n}\n";
    }


    public Double getSalary() {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("(Dane) Data: " + time + ", Wyp??ata: " + salary);
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary <= 0) {
            try {
                throw new Exception("Wyp??ata musi by?? wi??ksza ni?? 0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.firstName + " " + this.lastName + " Wyp??ata: " + salary);
        System.out.println("Nowe wyliczenia zosta??y wys??ane do systemu ksi??gowego.");
        System.out.println("Konieczne jest odebranie aneksu do umowy od pani Hani z kadr.");
        System.out.println("ZUS i US ju?? o wszystkim wiedz?? - nie ma sensu ukrywa?? dochodu.");

        this.salary = salary;
    }



    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Handel lud??mi jest nielegalny");
    }
}