package com.arda.protobuf;

import com.arda.models.Person;
import com.google.protobuf.Int32Value;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {

    public static void main(String[] args) throws IOException {
        /*
        Serializable - Deserializable
         */
        Person john = Person.newBuilder()
                .setName("John")
                .setAge(Int32Value.newBuilder().setValue(18).build())
                .build();

        Path path = Paths.get("john.text");
        //Files.write(path, john.toByteArray());
        Person newJohn = Person.parseFrom(Files.readAllBytes(path));
        System.out.println(newJohn);
    }
}
