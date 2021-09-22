package com.company.devices;
import com.company.Human;
import com.company.creatures.Human;
import com.company.salleable;


public class Car extends Device implements salleable {
    public String color;
    public Double mileage;
    public Double engineVolume;
    public Double value;
    public int doors;
    public int horsepower;

    public Car(String producer, String model, int yearOfProduction, int doors) {
        super(producer, model, yearOfProduction);
        this.doors = doors;
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction + "" +
                doors + " " + mileage + " " + horsepower + " " + color + " " +
                engineVolume + " " + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return doors == car.doors &&
                model.equals(car.model) &&
                mileage.equals(car.mileage) &&
                color.equals(car.color) &&
                engineVolume.equals(car.engineVolume) &&
                value.equals(car.value) &&
                producer.equals(car.producer);
    }

    @Override
    public int hashCode() {
        return doors;
    }

    @Override
    public void turnOn() {
        System.out.println("Samochód jest włączony");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getCar() != this) {
            System.out.println("Nie możesz sprzedać kradzionego samochodu");
        } else if (buyer.cash < price) {
            System.out.println("Kupujący nie ma tylu pieniędzy");
        } else if (seller == buyer) {
            System.out.println("Nie możesz sprzedać samochodu sobie samemu");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.setCar(seller.getCar());
            seller.takeCar();
            System.out.println("Udało się sprzedać samochód za " + price);
        }
    }
}
