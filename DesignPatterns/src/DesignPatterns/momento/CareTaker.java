package DesignPatterns.momento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Momento> momentoList = new ArrayList<>();

    public void push(Momento momento) {
        momentoList.add(momento);
    }

    public Momento pop() {
        var size = momentoList.size();
        var lastItem = momentoList.get(size - 1);
        momentoList.remove(lastItem);

        return lastItem;
    }

}
