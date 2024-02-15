package com.arda.protobuf;

import com.arda.json.JPerson;
import com.arda.models.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Int32Value;
import com.google.protobuf.InvalidProtocolBufferException;

public class PerformanceTest {

    public static void main(String[] args) {
        //json
        JPerson person1 = new JPerson();
        person1.setName("John");
        person1.setAge(18);

        ObjectMapper objectMapper = new ObjectMapper();

        Runnable json = () -> {
            try {
                //serializable
                byte[] bytes = objectMapper.writeValueAsBytes(person1);
                System.out.println(bytes.length);
                //deserializable
                JPerson person2 = objectMapper.readValue(bytes, JPerson.class);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        };

        //protobuf
        Person john = Person.newBuilder()
                .setName("John")
                .setAge(Int32Value.newBuilder().setValue(18).build())
                .build();

        Runnable proto = () -> {
            try {
                //serializable
                byte[] bytes = john.toByteArray();
                System.out.println(bytes.length);
                //deserializable
                Person john1 = Person.parseFrom(bytes);
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }
        };

        for (int i = 0; i < 1; i++) {
            runPerformanceTest(json, "JSON");
            runPerformanceTest(proto, "PROTO");
        }
    }

    private static void runPerformanceTest(Runnable runnable, String method) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            runnable.run();
        }
        long time2 = System.currentTimeMillis();

        System.out.println(method + ": " + (time2-time1) + " ms");
    }
}
