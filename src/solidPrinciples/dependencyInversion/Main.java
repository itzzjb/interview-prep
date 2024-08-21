package solidPrinciples.dependencyInversion;

public class Main {
    public static void main(String[] args) {
        // Depends on abstraction
        Switchable switchableBulb = new LightBulb();
        Switch.operate(true, switchableBulb);
        Switch.operate(false, switchableBulb);
    }
}
