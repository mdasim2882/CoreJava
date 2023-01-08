package DesignPatterns.adapter;

public class AssignmentWork {

    private PenInterface pen;

    public void writeAssignment(String text) {
        // Refilling a pen
        pen = new AdapterForUsingPen();
        pen.write(text);
    }

}
