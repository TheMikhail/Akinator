package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

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
        car5.gearbox = "automatic";
        Scanner sc = new Scanner(System.in);

        List<Car> carfilter = List.of(car1,car2,car3,car4,car5);
        System.out.println("Вы хотите Японскую машину?");
        if (sc.nextLine().equals("да")){
            List<Car> jdmCar = carfilter.stream().filter(car -> car.marketList.contains(Market.JDM)).collect(Collectors.toList());

            for(Car car : jdmCar){
                System.out.println(car.getName());
            }

            System.out.println("Вы хотите автомобиль на механической КПП?");
            if(sc.nextLine().equals("да"))

                jdmCar.stream().filter(car -> car.gearbox.contains("manual")).forEach(car->System.out.println(car.getName()));

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