package animals;

public class Wolf extends Animal{

    private String view;

    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Волк";

    public Wolf(int age, int weight, int numberOfLimbs, String view) {
        super(age, weight, numberOfLimbs);
        this.view = view;
    }

    public Wolf() {

    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String GetType() {
        return TYPE;
    }
    public void printWolf(){
        System.out.printf("Волк. Вес: " + getWeight() + "; " + "Возраст: " + getAge() + "; " + "Вид: " + this.view);
        System.out.println();
    }

    @Override
    public boolean feed(int foodWeight) {
        if (this.weight + foodWeight <= getMaxWeight()) {
            this.weight += foodWeight;
            System.out.println("Волк накормлен");
            return true;
        } else {
            System.out.println("Волка накормить не удалось");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "view='" + view + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
