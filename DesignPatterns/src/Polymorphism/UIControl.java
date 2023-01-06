package Polymorphism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class UIControl {

    public void enable() {
        System.out.println("Enabled");
    }

    public abstract void draw();
}
