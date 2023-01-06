package DesignPatterns.momento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Originator {

    private String content;

    // Each time, when a content gets added an object is created
    public Momento createState() {
      return new Momento(content);
    }

    // Restoring the previous content
    public void restoreState(Momento momento) {
       this.content = momento.getContent();
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
