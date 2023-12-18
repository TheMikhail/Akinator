package org.example;

import java.util.function.Predicate;

public class QuestionGearboxAutomatic {
    public String description(){
        return "Вы хотите машину на автомате?";
    }
    public Predicate filter(){
        Predicate<Car> automaticFilter = car -> car.gearbox.contains("automatic");
        return automaticFilter;
    }
}
