package org.owltech.behavioral.command;

public class Invoker {
    private final Command onCommand;
    private final Command offCommand;
    private final Command upCommand;
    private final Command downCommand;

    public Invoker(Command onCommand, Command offCommand, Command upCommand, Command downCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
        this.upCommand = upCommand;
        this.downCommand = downCommand;
    }

    public void clickOn() {
        this.onCommand.execute();
    }

    public void clickOff() {
        this.offCommand.execute();
    }

    public void clickUp() {
        this.upCommand.execute();
    }

    public void clickDown() {
        this.downCommand.execute();
    }
}
