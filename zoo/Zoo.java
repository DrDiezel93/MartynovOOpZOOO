package zoo;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;

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
        this.lionCage.AddAnimalCage(new Lion());
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "lionCage=" + lionCage +
                ", wolfCage=" + wolfCage +
                ", snakeCage=" + snakeCage +
                '}';
    }
}
