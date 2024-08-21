package solidPrinciples.liskovSubstitution;

public class Main {
    public static void main(String[] args) {
        FlyingBird crow = new Crow();
        Bird ostrich = new Ostrich();
        crow.fly();
    }
}
