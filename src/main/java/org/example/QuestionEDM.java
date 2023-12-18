package org.example;

import java.util.function.Predicate;

public class QuestionEDM {
    public String description(){
        return "Вы хотите Европейскую машину?";
    }
    public Predicate filter(){
        Predicate<Car> edmFilter = car -> car.marketList.contains(Market.EDM);
        return edmFilter;
    }
}
