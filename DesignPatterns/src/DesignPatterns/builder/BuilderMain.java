package DesignPatterns.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuilderMain {

    public static void main(String[] args) {

        // Instead of setting all values through constructor
        // we'll use PhoneBuilder class
        // Phone phone = new Phone(...)

        Phone phone = new PhoneBuilder()
                .setOs("Android")
                .setRam(2)
                .setScreenSize(6)
                .getPhone();

        System.out.println(phone);

    }
}
