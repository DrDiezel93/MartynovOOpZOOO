package cage;


import animals.Animal;
import animals.Lion;
import animals.LionComparator;

import java.util.ArrayList;
import java.util.Collections;

public class LionCage implements AnimalCage<Lion> {

    private ArrayList<Lion> lions;

    public LionCage() {
        lions = new ArrayList<>();
    }

    public LionCage(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    @Override
    public int AddAnimalCage(Lion animal) {
        lions.add(animal);
        return lions.size();
    }

    @Override
    public int DirtyCage(int weightFood) {
        int foodOfOne = weightFood / lions.size();
        for (Lion lion : lions) {
            if (lion.feed(foodOfOne)) {
                weightFood -= foodOfOne;
            }
        }
        System.out.printf("Остаток еды: " + weightFood);
        System.out.println();
        return weightFood;
    }

    @Override
    public void ClearCage() {
        if (lions.size() == 0) System.out.println("Клетка чиста");
        else {
            int siz = lions.size();
            lions.clear();
            System.out.printf("Клетка отчищена от " + siz + " львов");
        }
    }

    @Override
    public void ReturnAnimal() {
        int randAnimal = (int) ((Math.random() * (lions.size())));
        if (lions.size() == 0) System.out.println("Клетка чиста");
        else {
            System.out.println("Случайный лев из клетки");
            lions.remove(randAnimal).printLion();
        }
    }

    public ArrayList<Lion> getLions() {
        return lions;
    }

    public void sortLions() {
        Collections.sort(lions);
    }

    public void sortManeManeVolumeLions() {
        Collections.sort(lions, new LionComparator());
    }
}
