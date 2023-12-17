package org.example;

public class Car {

    public String getName() {
        return name + " " + model;
    }

    public String name;
    public enum Manufactory{
        Honda,
        Toyota,
        BMW,
        Mercedes,
        VAZ
    }
    public String model;
    public enum Market{
        JDM,
        USDM,
        EDM
    }
}
