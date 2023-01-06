package DesignPatterns.momento;

public class Momento {

    private final String content;

    public Momento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}