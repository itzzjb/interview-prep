package solid.openClosed;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        AreaCalculator.calculateArea(shape1);

        Shape shape2 = new Rectangle(5, 10);
        AreaCalculator.calculateArea(shape2);
    }
}
