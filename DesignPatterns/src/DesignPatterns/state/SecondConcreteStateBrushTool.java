package DesignPatterns.state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondConcreteStateBrushTool implements StateTool{
    @Override
    public void mouseUp() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a line");
    }
}
