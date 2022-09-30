package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Main {
    public static void main(String args[]) {
        ExecutorService service = Executors.newCachedThreadPool();

        for (int i=0; i<10; i++) {
            service.submit(() -> {
                SingletonJava.getInstance();
            });
        }

        service.shutdown();
    }
}