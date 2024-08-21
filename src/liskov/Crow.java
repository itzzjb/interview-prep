package liskov;

public class Crow extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Crow flying");
    }
}
