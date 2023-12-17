package org.example;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Car car1 = new Car();
        car1.model = "Civic";
        car1.manufactory = Manufactory.HONDA;
        car1.marketList = Collections.singletonList(Market.JDM);
        car1.gearbox = "manual";

        Car car2 = new Car();
        car2.model = "2111";
        car2.manufactory = Manufactory.VAZ;
        car2.marketList = Collections.singletonList(Market.RDM);
        car2.gearbox = "manual";

        Car car3 = new Car();
        car3.model = "e39";
        car3.manufactory = Manufactory.BMW;
        car3.marketList = Collections.singletonList(Market.EDM);
        car3.gearbox = "automatic";

        Car car4 = new Car();
        car4.model = "Corona";
        car4.manufactory = Manufactory.TOYOTA;
        car4.marketList = Collections.singletonList(Market.JDM);
        car4.gearbox = "automatic";

        Car car5 = new Car();
        car5.model = "w140";
        car5.manufactory = Manufactory.MERCEDES;
        car5.marketList = Collections.singletonList(Market.EDM);
        car5.gearbox = "manual";
        Scanner sc = new Scanner(System.in);
        System.out.println("Вы хотите Японскую машину?");

        if (sc.nextLine().equals("да")){
            System.out.println("Вы хотите автомобиль на механической КПП?");
            if(sc.nextLine().equals("да"))
                System.out.println(car1.getName());
            else
                System.out.println(car4.getName());
        }
        else {
            System.out.println("Вы хотите Немецкую машину?");
            if (sc.nextLine().equals("да")){
                System.out.println("Вы хотите автомобиль на механической КПП?");
                if(sc.nextLine().equals("да"))
                    System.out.println(car5.getName());
                else
                    System.out.println(car3.getName());
            }
            else
                System.out.println(car2.getName());
        }
    }
}