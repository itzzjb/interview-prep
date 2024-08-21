package designPatterns.observer;

public class Subscriber2 implements Observer {
    private String state;

    public void update(String state) {
        this.state = state;
        System.out.println("Subscriber2 received the updated state: " + state);
    }
}
