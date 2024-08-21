package interfaceSegregation;

public class Human implements Eatable, Workable {
    @Override
    public void eat() {
        System.out.println("Human is eating");
    }

    @Override
    public void work() {
        System.out.println("Human is working");
    }
}
