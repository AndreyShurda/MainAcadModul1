package animals;

import animals.birds.Owl;
import animals.birds.Parrot;
import animals.mamal.Elephant;
import animals.mamal.Lion;
import animals.mamal.Tigr;
import animals.reptail.Crocodile;
import animals.reptail.Snake;

import java.util.Arrays;

/**
 * Created by User on 12.02.2017.
 */
public class Zoo {

    public static void main(String[] args) {
        Animal[] animals = new Animal[0];

        animals = addAnimal(animals, new Elephant());
        animals = addAnimal(animals, new Elephant());
        animals = addAnimal(animals, new Tigr());
        animals = addAnimal(animals, new Lion());
        animals = addAnimal(animals, new Owl());
        animals = addAnimal(animals, new Parrot());
        animals = addAnimal(animals, new Crocodile());
        animals = addAnimal(animals, new Snake());

        feedAllAnimal(animals);

        System.out.println("===============");

    }

    public static Animal[] addAnimal(Animal[] animals, Animal newAnimal) {
        Animal[] newAnimals = Arrays.copyOf(animals, animals.length + 1);
        newAnimals[newAnimals.length - 1] = newAnimal;

        return newAnimals;
    }

    public static void feedAllAnimal(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
        }
    }


}
