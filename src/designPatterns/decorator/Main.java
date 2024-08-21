package designPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new PlainCoffee();
        System.out.println(coffee.getDescription() + ": $" + coffee.getCost());

        coffee = new MilkCoffeeDecorator(coffee);
        System.out.println(coffee.getDescription() + ": $" + coffee.getCost());
    }
}
