package org.example;

import java.util.function.Predicate;

public class QuestionGearboxManual {
    public String description(){
        return "Вы хотите машину на механике?";
    }
    public Predicate filter(){
        Predicate<Car> manualFilter = car -> car.gearbox.contains("manual");
        return manualFilter;
    }
}
