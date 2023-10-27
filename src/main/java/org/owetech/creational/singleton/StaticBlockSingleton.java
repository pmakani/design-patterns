package org.owetech.creational.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    static {
        instance = new StaticBlockSingleton();
    }

    private StaticBlockSingleton() {

    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
