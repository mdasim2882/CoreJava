package DesignPatterns.state;

public class ContextCanvas {
    private StateTool currentTool;

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void setCurrentTool(StateTool currentTool) {
        this.currentTool = currentTool;
    }

    public StateTool getCurrentTool() {
        return currentTool;
    }
}
