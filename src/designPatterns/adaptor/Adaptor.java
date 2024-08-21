package designPatterns.adaptor;

public class Adaptor implements Target{
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void request(){
        adaptee.someRequest();
    }
}
