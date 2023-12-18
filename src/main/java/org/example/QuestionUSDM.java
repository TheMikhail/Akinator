package org.example;

import java.util.function.Predicate;

public class QuestionUSDM {

    public String description(){
        return "Вы хотите Американскую машину?";
    }
    public Predicate filter(){
        Predicate<Car> usdmFilter = car -> car.marketList.contains(Market.USDM);
        return usdmFilter;
    }
}
