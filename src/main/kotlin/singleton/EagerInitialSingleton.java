package singleton;

public class EagerInitialSingleton {
    private static EagerInitialSingleton instance = new EagerInitialSingleton();

    private EagerInitialSingleton() {}

    public static EagerInitialSingleton getInstance() {
        return instance;
    }
}
