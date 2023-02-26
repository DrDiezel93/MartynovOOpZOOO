package terminal;

import zoo.Zoo;

public class CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactory(Zoo zoo) {
        this.zoo = zoo;
    }

    public void create (String[] input){
        for (String inp : input) {
            if(inp.equals("Удалить")){
                new DeleteLionExecutable(zoo).execute();
                System.out.println("Лев удален");
            }
            else if (inp.equals("Добавить")){
                new CreateLionExecutable(zoo).execute();
                System.out.println("Лев добавлен");
            }
        }
    }
}
