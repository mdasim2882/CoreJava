package Coupling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCalculator {

    public static void main(String[] args) {

        // Implementing Loose Coupling
        // Any changes made to the TaxCalculator2019 won't make any impact here
        TestCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());

    }

    public  static TestCalculator getCalculator(){
        return  new TaxCalculator2019();
    }

}
