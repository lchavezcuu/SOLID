package liskovSubstitution;

/**
 * Created by luis on 6/01/17.
 */
public class Shark extends Animal implements IDepredator {
    @Override
    public void Reproduce() {
        System.out.println("Reproducing sharks");
    }

    @Override
    public void Eat() {
        System.out.println("Eating fish because I'm a shark");
    }

    @Override
    public void Poop() {
        System.out.println("As a shark I need it!");
    }

    public void Hunt() {
        System.out.println("I'm hunting because I'm a shark");
    }
}
