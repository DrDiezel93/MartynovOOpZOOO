import animals.Lion;
import animals.Wolf;
import cage.LionCage;
import cage.WolfCage;
import factory.LionsFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf(5, 86, 4, "Кенайский");
        Wolf wolf2 = new Wolf(2, 23, 4, "Тасманский");
        Wolf wolf3 = new Wolf(8, 22, 4, "Манитобский");
        Wolf wolf4 = new Wolf(1, 22, 4, "Хоккайдо");
        Wolf wolf5 = new Wolf(3, 82, 4, "Флорида");
        WolfCage wolfCage = new WolfCage();
        wolfCage.AddAnimalCage(wolf1);
        wolfCage.AddAnimalCage(wolf2);
        wolfCage.AddAnimalCage(wolf3);
        wolfCage.AddAnimalCage(wolf4);
        wolfCage.AddAnimalCage(wolf5);
        System.out.println(wolfCage.getWolfs());
        wolfCage.sortWolfsAgeAndWeight();
        System.out.println(wolfCage.getWolfs());

        for (Wolf wolf : wolfCage.getWolfs()) {
            wolf.printWolf();
        }
        wolfCage.DirtyCage(100);
        for (Wolf wolf : wolfCage.getWolfs()) {
            wolf.printWolf();
        }
        wolfCage.ReturnAnimal();
        wolfCage.ClearCage();
        System.out.println();
        wolfCage.ReturnAnimal();
    }
}
