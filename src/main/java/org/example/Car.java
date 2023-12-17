package org.example;

public class Car {
    public String name;
    public Manufactory manufactory;
    public String model;
    public Market market;
    public String getName() {
        return name + " " + model;
    }
}
