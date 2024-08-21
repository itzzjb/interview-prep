package designPatterns.singleton;

public class SingletonClass {
    private static SingletonClass singletonInstance = null;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SingletonClass();
        }
        return singletonInstance;
    }

    public void printMessage() {
        System.out.println("SingletonClass: Hello World!");
    }

}
