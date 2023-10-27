package org.owetech.creational.singleton;

public class ThreadSafeSingleton1 {
    private static ThreadSafeSingleton1 instance;

    private ThreadSafeSingleton1() {

    }

    public static ThreadSafeSingleton1 getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton1.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton1();
                }
            }
        }
        return instance;
    }

}
