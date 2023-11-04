package org.owltech.structural.composite;

public class Triangle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("Drawing Triangle with color " + color);
    }
}
