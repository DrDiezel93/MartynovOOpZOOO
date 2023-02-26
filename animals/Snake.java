package animals;

public class Snake extends Animal {

    private int bodyLength;

    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Змея";

    public Snake(int age, int weight, int bodyLength) {
        super(age, weight);
        this.bodyLength = bodyLength;
    }

    public int getBodyLength() {

        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {

        this.bodyLength = bodyLength;
    }


    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String GetType() {
        return TYPE;
    }

    public void printSnake(){
        System.out.printf("Змея. Вес: " + getWeight() + "; " + "Возраст: " + getAge() + "; " + "Длина тела: " + this.bodyLength);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Snake{" +
                "bodyLength=" + bodyLength +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
