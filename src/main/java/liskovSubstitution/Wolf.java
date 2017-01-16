package liskovSubstitution;

/**
 * Created by luis on 6/01/17.
 */
public class Wolf extends Animal implements IDepredator {
    @Override
    public void Reproduce() {
        System.out.println("Reproducing wolves");
    }

    @Override
    public void Eat() {
        System.out.println("Eating deer because I'm a wolf");
    }

    @Override
    public void Poop() {
        System.out.println("As a wolf I need it!");
    }

    public void Hunt() {
        System.out.println("I'm hunting because I'm a wolf");
    }
}
