package cage;

import animals.Animal;
public class WolfCage implements AnimalCage {
    @Override
    public int AddAnimalCage(Animal animal) {
        return 0;
    }

    @Override
    public int DirtyCage(int weightFood) {
        return 0;
    }

    @Override
    public void ClearCage() {

    }

    @Override
    public void ReturnAnimal() {

    }
}
