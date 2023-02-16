package cage;

import animals.Animal;

import java.util.ArrayList;

public interface AnimalCage {
    int AddAnimalCage(Animal animal);
    int DirtyCage(int weightFood);
    void ClearCage();
    void ReturnAnimal();
}
