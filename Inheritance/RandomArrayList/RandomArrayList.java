package Inheritance.RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E> {

    public E getRandomElement() {
        Random random = new Random();
        int randomIndex = random.nextInt(this.size());
        return this.remove(randomIndex);
    }
}
