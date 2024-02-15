package com.arda.protobuf;

import com.arda.models.Address;
import com.arda.models.Car;
import com.arda.models.Person;
import com.google.protobuf.Int32Value;

import java.util.List;

public class CompositionDemo {

    public static void main(String[] args) {
        Address address = Address.newBuilder()
                .setCity("Ankara")
                .setStreet("Cihangir")
                .setPostalCode(12345)
                .build();

        Car bmw = Car.newBuilder()
                .setBrand("BMW")
                .setModel("X5")
                .setYear(2022)
                .build();
        Car audi = Car .newBuilder()
                .setBrand("AUDI")
                .setModel("A5")
                .setYear(2022)
                .build();

        List<Car> cars = List.of(bmw, audi);

        Person person = Person.newBuilder()
                .setName("Arda")
                .setAge(Int32Value.newBuilder().setValue(2).build())
                .setAddress(address)
                .addCar(bmw)
                .addAllCar(cars)
                .build();

        System.out.println(person);
    }
}
