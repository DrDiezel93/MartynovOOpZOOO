package animals;

public class Lion extends Animal implements Comparable<Lion> {
    private int maneVolume;
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Лев";

    public Lion(int age, int weight, int numberOfLimbs, int maneVolume) {
        super(age, weight, numberOfLimbs);
        this.maneVolume = maneVolume;
    }

    public Lion() {

    }

    public int getManeVolume() {
        return maneVolume;
    }

    public void setManeVolume(int maneVolume) {
        this.maneVolume = maneVolume;
    }


    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String GetType() {
        return TYPE;
    }

    public void printLion() {
        System.out.printf("Лев. Взраст: " + getAge() + "; " + "Вес: " + getWeight());
        System.out.println();
    }

    @Override
    public boolean feed(int foodWeight) {
        if (this.weight + foodWeight <= getMaxWeight()) {
            this.weight += foodWeight;
            System.out.println("Лев накормлен");
            return true;
        } else {
            System.out.println("Льва накормить не удалось");
            return false;
        }
    }

    @Override
    public int compareTo(Lion o) {
        if (this.age > o.getAge()) return 1;
        else if (this.age < o.getAge()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "maneVolume=" + maneVolume +
                ", age=" + age +
                ", weight=" + weight +
                ", numberOfLimbs=" + numberOfLimbs +
                '}';
    }
}
