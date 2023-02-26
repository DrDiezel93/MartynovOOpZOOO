import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.LionCage;
import cage.SnakeCage;
import cage.WolfCage;
import zoo.Zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf(5, 86, 4, "Кенайский");
        Wolf wolf2 = new Wolf(2, 23, 4, "Тасманский");
        Lion lion1 = new Lion(5, 56, 4, 85);
        Lion lion2 = new Lion(3, 26, 4, 65);
        Lion lion3 = new Lion(6, 45, 4, 55);
        Lion lion4 = new Lion(2, 35, 4, 45);
        Snake snake1 = new Snake(6, 63, 96);
        Snake snake2 = new Snake(2, 61, 86);
        WolfCage wolfCage = new WolfCage();
        LionCage lionCage = new LionCage();
        SnakeCage snakeCage = new SnakeCage();
        wolfCage.AddAnimalCage(wolf1);
        wolfCage.AddAnimalCage(wolf2);
        lionCage.AddAnimalCage(lion1);
        lionCage.AddAnimalCage(lion2);
        lionCage.AddAnimalCage(lion3);
        lionCage.AddAnimalCage(lion4);
        snakeCage.AddAnimalCage(snake1);
        snakeCage.AddAnimalCage(snake2);
        System.out.println(wolfCage.getWolfs());
        System.out.println(lionCage.getLions());
        System.out.println(snakeCage.getSnakes());
        Zoo zoo = new Zoo(lionCage, wolfCage, snakeCage);

    }
}
