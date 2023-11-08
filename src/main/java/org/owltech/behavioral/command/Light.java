package org.owltech.behavioral.command;

public class Light implements Device {
    @Override
    public void on() {
        System.out.println("Light Turn On");
    }

    @Override
    public void off() {
        System.out.println("Light Turn Off");
    }

    @Override
    public void up() {
        System.out.println("Increase Brightness ");
    }

    @Override
    public void down() {
        System.out.println("Decrease Brightness");
    }
}
