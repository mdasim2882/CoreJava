package Coupling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxCalculator2019 implements TestCalculator {


    @Override
    public float calculateTax() {
        return 1;
    }

    // Adding one more function here
    public float calculateInsurance() {
        return 2;
    }
}
