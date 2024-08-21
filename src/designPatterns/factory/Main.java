package designPatterns.factory;

public class Main {
    public static void main(String[] args) {
        Product product1 = ProductFactory.getInstance("Product1");
        product1.use();
        Product product2 = ProductFactory.getInstance("Product2");
        product2.use();
    }
}
