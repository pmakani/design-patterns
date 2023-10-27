package org.owetech.creational.singleton;

public class SingletonExample {
    public static void main(String[] args) {

        EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();

        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();

        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();

        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();

        ThreadSafeSingleton1 threadSafeSingleton1 = ThreadSafeSingleton1.getInstance();
    }
}
