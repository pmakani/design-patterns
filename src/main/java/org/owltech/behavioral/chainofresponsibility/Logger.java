package org.owltech.behavioral.chainofresponsibility;

public abstract class Logger {
    public static int OUTPUT_INFO = 1;
    public static int ERROR_INFO = 2;
    public static int DEBUG_INFO = 3;
    protected int levels;
    protected Logger logger;

    public void setNextLevelLogger(Logger levelLogger) {
        this.logger = levelLogger;
    }

    public void logMessage(int levels, String msg) {
        if (this.levels <= levels) {
            displayLogInfo(msg);
        }
        if (logger != null) {
            logger.logMessage(levels, msg);
        }
    }

    protected abstract void displayLogInfo(String msg);

}
