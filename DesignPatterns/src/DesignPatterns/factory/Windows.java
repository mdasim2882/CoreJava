package DesignPatterns.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Windows implements OSInterface{


    @Override
    public void spec() {
        System.out.println("Most used OS by Computers ... ");
    }
}
