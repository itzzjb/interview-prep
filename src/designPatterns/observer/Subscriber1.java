package designPatterns.observer;

public class Subscriber1 implements Observer {
    private String state;

    public void update(String state) {
        this.state = state;
        System.out.println("Subscriber1 received the updated state: " + state);
    }
}
