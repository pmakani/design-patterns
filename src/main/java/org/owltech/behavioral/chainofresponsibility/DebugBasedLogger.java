package org.owltech.behavioral.chainofresponsibility;

public class DebugBasedLogger extends Logger {

    public DebugBasedLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("DebugBaseLogger");
    }
}
