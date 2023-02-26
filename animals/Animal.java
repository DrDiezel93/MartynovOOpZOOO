package animals;

public abstract class Animal {
    protected int age;
    protected int weight;
    protected int numberOfLimbs;

    public Animal(int age, int weight, int numberOfLimbs) {
        this.age = age;
        this.weight = weight;
        this.numberOfLimbs = numberOfLimbs;
    }

    public Animal() {
        this.age = age;
        this.weight = weight;
    }

    public Animal(int age, int weight) {

    }

    public boolean feed(int foodWeight) {
        if (this.weight + foodWeight <= getMaxWeight()) {
            this.weight += foodWeight;
            System.out.println(this.weight);
            return true;
        } else {
            System.out.println(this.weight);
            return false;
        }
    }

    public abstract int getMaxWeight();

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public void setNumberOfLimbs(int numberOfLimbs) {

        this.numberOfLimbs = numberOfLimbs;
    }

    public abstract String GetType();
}
