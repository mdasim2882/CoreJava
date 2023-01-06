package DesignPatterns.momento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMomentoPattern {

    public static void main(String[] args) {

        var originator = new Originator();
        var careTaker = new CareTaker();

        originator.setContent("a");
        careTaker.push(originator.createState());

        originator.setContent("b");
        careTaker.push(originator.createState());

        originator.setContent("c");
        // Here, we're not storing state of "c"
//        careTaker.push(originator.createState());


        System.out.println(originator.getContent());
        System.out.println("value = " + (careTaker.pop()).getContent());

        originator.restoreState(careTaker.pop());

        System.out.println(originator.getContent());

    }

}
