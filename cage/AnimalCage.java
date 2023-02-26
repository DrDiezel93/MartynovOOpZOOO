package cage;

import animals.Animal;
import animals.Lion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface AnimalCage <T extends Animal> {
    int AddAnimalCage(T animal);
    int DirtyCage(int weightFood);
    void ClearCage();
    void ReturnAnimal();
}
