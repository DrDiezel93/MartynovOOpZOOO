package cage;

import animals.Snake;
import animals.Wolf;
import animals.WolfComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SnakeCage implements AnimalCage<Snake>{
    private ArrayList<Snake> snakes;

    public SnakeCage(){
        snakes = new ArrayList<>();
    }
    public SnakeCage(ArrayList<Snake> snakes){
        this.snakes = snakes;
    }
    @Override
    public int AddAnimalCage(Snake animal) {
        snakes.add(animal);
        return snakes.size();
    }

    @Override
    public int DirtyCage(int weightFood) {
        int foodOfOne = weightFood / snakes.size() ;
        for (Snake snake : snakes ) {
            if(snake.feed(foodOfOne)){
                weightFood -= foodOfOne;
            }
        }
        System.out.printf("Остаток еды: " + weightFood);
        System.out.println();
        return weightFood;
    }

    @Override
    public void ClearCage() {
        if(snakes.size() == 0) System.out.println("Клетка чиста");
        else {
            int siz = snakes.size();
            snakes.clear();
            System.out.printf("Клетка отчищена от " + siz + " змей");
        }
    }

    @Override
    public void ReturnAnimal() {
        int randAnimal = (int) ((Math.random() * (snakes.size())));
        if(snakes.size() == 0) System.out.println("Клетка чиста");
        else {
            System.out.println("Случайный волк из клетки");
            snakes.remove(randAnimal).printSnake();
        }
    }

    public ArrayList<Snake> getSnakes() {
        return snakes;
    }
}
