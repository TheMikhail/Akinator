package org.example;

import java.util.function.Predicate;

public class QuestionRDM {
    public String description(){
        return "Вы хотите Российскую машину?";
    }
    public Predicate filter(){
        Predicate<Car> rdmFilter = car -> car.marketList.contains(Market.RDM);
        return rdmFilter;
    }
}
