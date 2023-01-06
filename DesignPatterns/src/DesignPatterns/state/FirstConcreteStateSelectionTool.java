package DesignPatterns.state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstConcreteStateSelectionTool implements StateTool {

    @Override
    public void mouseUp() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a dashed rectangle ");
    }
}
