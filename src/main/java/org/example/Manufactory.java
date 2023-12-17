package org.example;

public enum Manufactory {
    HONDA("Хонда"),
    TOYOTA("Тойота"),
    BMW("БМВ"),
    MERCEDES("Мерседес"),
    VAZ("ВАЗ");
    private final String manufactory;

    Manufactory(String manufactory){
        this.manufactory = manufactory;
    }
    @Override
    public String toString(){
        return manufactory;
    }
}
