package zoo;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;

import java.util.Scanner;

public class Zoo {
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Snake> snakeCage;

    public Zoo(AnimalCage<Lion> lionCage, AnimalCage<Wolf> wolfCage, AnimalCage<Snake> snakeCage) {
        this.lionCage = lionCage;
        this.wolfCage = wolfCage;
        this.snakeCage = snakeCage;
    }

    public Zoo() {
    }

    public void takeOfLion(){
        this.lionCage.ReturnAnimal();
    }

    public void addLionInCage(){
        Lion newLion = new Lion(0,0);
        newLion.setAge(inputAgeAnimal());
        newLion.setWeight(inputWeightAnimal());
        this.lionCage.AddAnimalCage(newLion);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "lionCage=" + lionCage +
                ", wolfCage=" + wolfCage +
                ", snakeCage=" + snakeCage +
                '}';
    }
    public int inputAgeAnimal() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите возраст животного: ");
        return iScanner.nextInt();
    }
    public int inputWeightAnimal() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите вес животного: ");
        return iScanner.nextInt();
    }
}
