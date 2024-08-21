package designPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonClass singletonInstance = SingletonClass.getInstance();
        singletonInstance.printMessage();
    }
}
