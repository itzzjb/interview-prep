package designPatterns.adaptor;

public class Main {
    public static void main(String[] args) {
        // pass the adaptee object to the adaptor
        Target target = new Adaptor(new Adaptee());
        // someRequest() is called through the request() method
        target.request();
    }
}
