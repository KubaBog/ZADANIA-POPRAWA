package com.company;
import java.time.LocalDateTime;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Phone mobilePhone;
    Car car;
    private double salary;

    public Double getSalary() {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("(Dane) Data: " + time + ", Wypłata: " + salary);
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary <= 0) {
            try {
                throw new Exception("Wypłata musi być większa niż 0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.firstName + " " + this.lastName + " Wypłata: " + salary);
        System.out.println("Nowe wyliczenia zostały wysłane do systemu księgowego.");
        System.out.println("Konieczne jest odebranie aneksu do umowy od pani Hani z kadr.");
        System.out.println("ZUS i US już o wszystkim wiedzą - nie ma sensu ukrywać dochodu.");

        this.salary = salary;
    }
}