package org.owltech.structural.flyweight;

public class Tree {
    private final String color;
    private final int height;

    public Tree(String color) {
        this.color = color;
        this.height = 6;
    }

    public String getColor() {
        return this.color;
    }

    public int getHeight() {
        return this.height;
    }
}
