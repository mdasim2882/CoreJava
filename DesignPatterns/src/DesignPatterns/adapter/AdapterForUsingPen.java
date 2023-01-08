package DesignPatterns.adapter;

import DesignPatterns.adapter.helperPackage.PilotPen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdapterForUsingPen implements PenInterface{

    // Using pilot pen
    PilotPen pilotPen = new PilotPen();

    @Override
    public void write(String text) {
        // Writing text using Pilot Pen
        pilotPen.mark(text);
    }
}
