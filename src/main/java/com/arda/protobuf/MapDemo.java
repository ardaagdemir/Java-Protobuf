package com.arda.protobuf;

import com.arda.models.Car;
import com.arda.models.Dealer;

public class MapDemo {
    public static void main(String[] args) {
        Car car = Car.newBuilder()
                .setBrand("BMW")
                .setModel("X5")
                .setYear(2020)
                .build();
        Car car2 = Car.newBuilder()
                .setBrand("BMW")
                .setModel("X6")
                .setYear(2021)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel("Car1: ", car)
                .putModel("Car2: ", car2)
                .build();

        //System.out.println(dealer.getModelOrThrow(2020));
        //System.out.println(dealer.getModelOrDefault(2019, car2));
        System.out.println(dealer.getModelMap());
    }
}
