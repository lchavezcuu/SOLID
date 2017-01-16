package liskovSubstitution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by luis on 6/01/17.
 */
public class LiskovTest {

    public static void main(String [] args){
        Animal animal=new Animal();
        Wolf wolf=new Wolf();
        Shark shark=new Shark();
        Monkey monkey=new Monkey();

        List<Animal> animals=new ArrayList<Animal>();
        animals.add(animal);
        animals.add(wolf);
        animals.add(shark);
        animals.add(monkey);

        Iterator<Animal> animalIterator=animals.iterator();
        while (animalIterator.hasNext()){
            animalIterator.next().Eat();
        }

        //Here we can verify that the wolf object is in fact an animal
        animal=wolf;
        animal.Eat();

        /*
        animal.hunt() --> This gives error due that the Animal class does not
        include the hunt() method due this is an specific behavior of Wolf
        */

        //Here we can verify that the shark object is in fact an animal
        animal=shark;
        animal.Eat();

        /*
        animal.hunt() --> This gives error due that the Animal class does not
        include the hunt() method due this is an specific behavior of Shark
        */

        //Here we can verify that the monkey object is in fact an animal
        animal=monkey;
        animal.Eat();

        /*
        wolf=shark; --> Gives error due they are different object types,
        does not matter if their father is the same
        */

    }
}
