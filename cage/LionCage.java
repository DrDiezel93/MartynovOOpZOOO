package cage;


import animals.Animal;
import animals.Lion;

import java.util.ArrayList;

public class LionCage implements AnimalCage {

    private int clean;

   private ArrayList<Lion> lions;

   public LionCage(){
       lions = new ArrayList<>();
   }

   public LionCage(ArrayList<Lion> lions){
        this.lions = lions;
    }

    @Override
    public int AddAnimalCage(Animal animal) {
        lions.add((Lion)animal);
        return lions.size();
    }

    @Override
    public int DirtyCage(int weightFood) {
       int foodOfOne = weightFood / lions.size() ;
        for (Lion lion : lions ) {
            if(lion.feed(foodOfOne)){
                weightFood -= foodOfOne;
            }
        }
        System.out.printf("Остаток еды: " + weightFood);
        System.out.println();
        return weightFood;
    }

    @Override
    public void ClearCage() {
       if(lions.size() == 0) System.out.println("Клетка чиста");
       else {
           int siz = lions.size();
           lions.clear();
           System.out.printf("Клетка отчищена от " + siz + " львов");
       }
    }

    @Override
    public void ReturnAnimal() {
        int randAnimal = (int) ((Math.random() * (lions.size() - 0)) + 0);
        System.out.println("Случайный лев из клетки");
        lions.get(randAnimal).printLion();
    }

    public ArrayList<Lion> getLions() {
        return lions;
    }
}
