package org.example;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public Manufactory manufactory;
    public String model;
    public List<Market> marketList = new ArrayList<>();
    public String getName() {
        return manufactory + " " + model;
    }
}
