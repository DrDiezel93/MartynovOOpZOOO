package terminal;

public class Command {

    private String inp;

    public static String addStatic = "Добавить";

    public static String delStatic = "Удалить";

    public static String endStatic = "Конец";

    public Command(String inp) {
        this.inp = inp;
    }

    public boolean add (){
        return this.inp.equals(addStatic);
    }

    public boolean del (){
        return this.inp.equals(delStatic);
    }

    public boolean end (){
        return this.inp.equals(endStatic);
    }
}
