package DesignPatterns.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryMain {
    public static void main(String[] args) {

        /*
        * To use a Factory Pattern, we need some class that provides instance
        * by specifying its name only
        * */
        // OSInterface os  = new Android();
        // os.spec();

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OSInterface os = osf.getInstance("IOS");
        os.spec();


    }
}