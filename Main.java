import animals.Lion;
import cage.LionCage;
import factory.LionsFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lion> lions = LionsFactory.createLions(5);
        LionCage lionsCage = new LionCage(lions);
        for (Lion lion : lions) {
            lion.printLion();
        }
        Lion lion1 = new Lion(5, 52, 4, 42);
        Lion lion2 = new Lion(4, 64, 4, 32);
        Lion lion3 = new Lion(2, 32, 4, 22);
        Lion lion4 = new Lion(7, 86, 4, 52);
        Lion lion5 = new Lion(3, 46, 4, 11);
        LionCage lionCage = new LionCage();
        lionCage.AddAnimalCage(lion1);
        lionCage.AddAnimalCage(lion2);
        lionCage.AddAnimalCage(lion3);
        lionCage.AddAnimalCage(lion4);
        lionCage.AddAnimalCage(lion5);
//        for (Lion lion : lionCage.getLions()) {
//            lion.feed(10);
//        }
//        for (Lion lion : lionCage.getLions()) {
//            lion.printLion();
//        }
        lionCage.DirtyCage(100);
        for (Lion lion : lionCage.getLions()) {
            lion.printLion();
        }
//        lionCage.ClearCage();
        lionCage.ReturnAnimal();
    }
}
