package DesignPatterns.state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainStateDesignPattern {
    public static void main(String[] args) {
        /*
        * Now, we can use any tool by just setting its reference.
        * Additionally, we can also include any other tool by creating its class
        * and then implementing the StateTool to specify its functionalities
        * */
        ContextCanvas canvas = new ContextCanvas();
        canvas.setCurrentTool(new FirstConcreteStateSelectionTool());
        canvas.mouseUp();
        canvas.mouseDown();

        // Setting Brush tool
        canvas.setCurrentTool(new SecondConcreteStateBrushTool());
        canvas.mouseUp();
        canvas.mouseDown();

    }

}
