package singleton;

public class SingletonJava {
    static {
        System.out.println("SingletonJava is loaded by ClassLoader!!");
    }
    private static SingletonJava instance;
    String name = "Singleton in Java";

    private SingletonJava() {
        System.out.println("Created SingletonJava Instance!!");
    }

    public static SingletonJava getInstance() {
        if (instance == null) {
            instance = new SingletonJava();
        }
        return instance;
    }

    public void printName() {
        System.out.println("My name is " + this.name +  "!!");
    }
}
