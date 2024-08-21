package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
