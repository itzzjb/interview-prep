package designPatterns.factory;

public class ProductFactory {
    public static Product getInstance(String productType) {
        if (productType.equals("Product1")) {
            return new Product1();
        } else if (productType.equals("Product2")) {
            return new Product2();
        }
        return null;
    }
}
