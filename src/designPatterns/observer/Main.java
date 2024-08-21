package designPatterns.observer;

public class Main {
    public static void main(String[] args) {
        Observer subscriber1 = new Subscriber1();
        Observer subscriber2 = new Subscriber2();

        Subject publisher = new Publisher();
        publisher.registerObserver(subscriber1);
        publisher.registerObserver(subscriber2);
        publisher.setState("State 1");

        publisher.removeObserver(subscriber1);
        publisher.setState("State 2");
    }
}
