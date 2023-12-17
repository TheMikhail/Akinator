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

        Car car2 = new Car();
        car2.model = "2111";
        car2.manufactory = Manufactory.VAZ;
        car2.marketList = Collections.singletonList(Market.RDM);

        Car car3 = new Car();
        car3.model = "e39";
        car3.manufactory = Manufactory.BMW;
        car3.marketList = Collections.singletonList(Market.EDM);

        Scanner sc = new Scanner(System.in);
        System.out.println("Вы хотите Японскую машину?");

        if (sc.nextLine().equals("да"))
            System.out.println(car1.getName());
        else {
            System.out.println("Вы хотите Немецкую машину?");
            if (sc.nextLine().equals("да"))
                System.out.println(car3.getName());
            else
                System.out.println(car2.getName());
        }
    }
}