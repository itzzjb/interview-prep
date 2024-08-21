package designPatterns.decorator;

public class MilkCoffeeDecorator extends CoffeeDecorator{
    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Add Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.0;
    }
}
