package org.owltech.behavioral.command;

public class Speaker implements Device {
    @Override
    public void on() {
        System.out.println("Speaker Turn On");
    }

    @Override
    public void off() {
        System.out.println("Speaker Turn Off");
    }

    @Override
    public void up() {
        System.out.println("Volume Up");
    }

    @Override
    public void down() {
        System.out.println("Volume Down");
    }
}
