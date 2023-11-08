package org.owltech.behavioral.command;

public class CommandExample {
    public static void main(String[] args) {
        Device light = new Light();
        Invoker invoker = new Invoker(new OnCommand(light), new OffCommand(light), new UpCommand(light), new DownCommand(light));

        invoker.clickOn();
        invoker.clickOff();
        invoker.clickUp();
        invoker.clickDown();
    }
}
