package com.company.devices;

import com.company.creatures.Human;
import com.company.salleable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Phone extends Device implements salleable {
    final Double screenSize;
    final String operatingSystem;

    public static final String DEFAULT_SERVER_ADDRESS = "117.10.1.1";
    public static final String DEFAULT_SERVER_PROTOCOL = "http";
    public static final String DEFAULT_VERSION_NAME = "latest";
    List<Application> applicationList;

    public Phone(String producer, String model, int yearOfProduction, Double value, Double screenSize, String operatingSystem) {
        super(producer, model, yearOfProduction, value);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.applicationList = new ArrayList<>();
    }

    public void installAnApp(Human owner, Application application) {
        if (owner.cash < application.price) {
            System.out.println("Brak funduszy na instalację aplikacji.");
        } else {
            owner.cash -= application.price;
            this.applicationList.add(application);
        }
    }

    public boolean hasApplication(Application applicationObject) {
        for (Application application : applicationList) {
            if (application == applicationObject) {
                return true;
            }
        }

        return false;
    }

    public boolean hasApplication(String applicationName) {
        for (Application application : applicationList) {
            if (application.name.equals(applicationName)) {
                return true;
            }
        }

        return false;
    }

    public void showAllFreeApplications() {
        System.out.println("Darmowe aplikacje:");

        for (Application application : applicationList) {
            if (application.price == 0.0) {
                System.out.print(application);
            }
        }
    }

    public void showAllApplications() {
        System.out.println("Aplikacje: ");

        for (Application application : applicationList) {
            System.out.print(application);
        }
        System.out.println();
    }

    public void sortApplicationsByName() {
        applicationList.sort(Application.byName);
        System.out.println("Aplikacje wg nazwy: ");

        for (Application application : applicationList) {
            System.out.print(application);
        }
    }

    public void sortApplicationsByPrice() {
        applicationList.sort(Application.byPrice);
        System.out.println("Aplikacje wg ceny: ");

        for (Application application : applicationList) {
            System.out.print(application);
        }
    }


    @Override
    public String toString() {
        return "Phone {" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", screenSize=" + screenSize +
                ", operatingSystem='" + operatingSystem + '\'' +
                "producer = '" + producer + '\'' +
                ", model = '" + model + '\'' +
                ", yearOfProduction = " + yearOfProduction +
                ", screenSize = " + screenSize +
                ", operatingSystem = '" + operatingSystem + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon jest włączony");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.mobilePhone != this) {
            System.out.println("Nie możesz sprzedać kradzionego telefonu");
        } else if (buyer.cash < price) {
            System.out.println("Kupujący nie ma tylu pieniędzy");
        } else if (seller == buyer) {
            System.out.println("Nie możesz sprzedać telefonu sobie samemu");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.mobilePhone = seller.mobilePhone;
            seller.mobilePhone = null;
            System.out.println("Udało się sprzedać telefon za " + price);
        }
    }

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_VERSION_NAME);
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }

    public void installAnApp(String appName, String version, String serverAddress) {
        URL appLink = null;
        try {
            appLink = new URL(DEFAULT_SERVER_PROTOCOL, serverAddress, appName + "_" + version);
            this.installAnApp(appLink);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnApp(URL appSourceURL) {
        System.out.println("Pobieranie aplikacji " + appSourceURL.getFile() + " z adresu " + appSourceURL.getHost());
        System.out.println("Instalacja aplikacji " + appSourceURL.getFile());
        System.out.println("Aplikacja " + appSourceURL.getFile() + " zainstalowana");
    }

    public void installAnApp(List<String> applications) {
        String[] array = new String[applications.size()];
        array = applications.toArray(array);

        this.installAnApp(array);
    }

    public void installAnApp(String[] applications) {
        for (String appName : applications) {
            this.installAnApp(appName);
        }
    }

}