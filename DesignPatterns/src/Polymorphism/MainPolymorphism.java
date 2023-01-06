package Polymorphism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainPolymorphism {

    public static void main(String[] args) {

        // Achieving polymorphism...by trying references of different classes
        drawUIControl(new CheckBox());

        drawUIControl(new TextBox());
    }

    //Here, uiControl can take many forms depicting Polymorphism
    public static void drawUIControl(UIControl uiControl) {
        uiControl.draw();
    }
}
