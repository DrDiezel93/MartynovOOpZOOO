package animals;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal animal1, Animal animal2) {
        return Integer.compare(animal1.getAge(), animal2.getAge());
    }
}
