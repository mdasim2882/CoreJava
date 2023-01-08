package DesignPatterns.adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdapterMain {
    public static void main(String[] args) {
        AssignmentWork work = new AssignmentWork();
        work.writeAssignment("I'm about to write ...");
    }
}
