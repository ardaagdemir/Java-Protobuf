package com.arda.protobuf;

import com.arda.models.Credentials;
import com.arda.models.EmailCredentials;
import com.arda.models.PhoneOTP;

public class OneOfDemo {

    public static void main(String[] args) {
        EmailCredentials emailCredentials = EmailCredentials.newBuilder()
                .setEmail("test")
                .setPassword("test")
                .build();

        PhoneOTP phoneOTP = PhoneOTP.newBuilder()
                .setNumber(123)
                .setCode(123)
                .build();

        Credentials credentials = Credentials.newBuilder()
                .setEmailMode(emailCredentials)
                .setPhoneMode(phoneOTP)
                .build();

        login(credentials);
    }

    private static void login(Credentials credentials) {
        System.out.println(credentials.getPhoneMode());
    }
}
