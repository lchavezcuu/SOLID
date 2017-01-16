package liskovSubstitution;

/**
 * Created by luis on 6/01/17.
 */
public class Monkey extends Animal{
    @Override
    public void Reproduce() {
        System.out.println("Reproducing monkeys");
    }

    @Override
    public void Eat() {
        System.out.println("Eating bananas because I'm a monkey");
    }

    @Override
    public void Poop() {
        System.out.println("As a monkey I need it!");
    }
}
