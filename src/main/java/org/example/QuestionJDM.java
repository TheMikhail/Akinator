package org.example;

import java.util.function.Predicate;

public class QuestionJDM {
    public String description(){
        return "Вы хотите Японскую машину?";
    }
    public Predicate filter(){
        Predicate<Car> jdmFilter = car -> car.marketList.contains(Market.JDM);
        return jdmFilter;
    }



}
