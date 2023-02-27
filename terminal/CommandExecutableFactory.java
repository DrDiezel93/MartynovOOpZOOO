package terminal;

import zoo.Zoo;

public class CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactory(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create (String[] input){
        for (String inp : input) {
            if(inp.equals("Удалить")){
                return new DeleteLionExecutable(zoo);
            }
            else if (inp.equals("Добавить")){
                return new CreateLionExecutable(zoo);
            }
        }
        return null;
    }
}
