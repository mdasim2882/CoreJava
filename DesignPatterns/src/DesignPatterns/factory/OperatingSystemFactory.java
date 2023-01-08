package DesignPatterns.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatingSystemFactory {

    public OSInterface getInstance(String str) {
        switch (str) {
            case "Android":
                return new Android();
            case "IOS":
                return new IOS();
            default:
                return new Windows();
        }


    }

}
