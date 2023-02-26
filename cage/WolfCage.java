package cage;

import animals.*;

import java.util.ArrayList;
import java.util.Collections;

public class WolfCage implements AnimalCage<Wolf> {
    private ArrayList<Wolf> wolfs;

    public WolfCage(){
        wolfs = new ArrayList<>();
    }
    public WolfCage(ArrayList<Wolf> wolfs){
        this.wolfs = wolfs;
    }
    @Override
    public int AddAnimalCage(Wolf animal) {
        wolfs.add(animal);
        return wolfs.size();
    }

    @Override
    public int DirtyCage(int weightFood) {
        int foodOfOne = weightFood / wolfs.size() ;
        for (Wolf wolf : wolfs ) {
            if(wolf.feed(foodOfOne)){
                weightFood -= foodOfOne;
            }
        }
        System.out.printf("Остаток еды: " + weightFood);
        System.out.println();
        return weightFood;
    }

    @Override
    public void ClearCage() {
        if(wolfs.size() == 0) System.out.println("Клетка чиста");
        else {
            int siz = wolfs.size();
            wolfs.clear();
            System.out.printf("Клетка отчищена от " + siz + " волков");
        }
    }

    @Override
    public void ReturnAnimal() {
        int randAnimal = (int) ((Math.random() * (wolfs.size())));
        if(wolfs.size() == 0) System.out.println("Клетка чиста");
        else {
            System.out.println("Случайный волк из клетки");
            wolfs.remove(randAnimal).printWolf();
        }
    }

    public ArrayList<Wolf> getWolfs() {
        return wolfs;
    }

    public void sortWolfsAgeAndWeight() {
        Collections.sort(wolfs, new WolfComparator());
    }
}
