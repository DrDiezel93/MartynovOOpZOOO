package terminal;

import zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{
    private Zoo zoo;

    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }
    @Override
    public CommandExecutable create (Command com){
            if(com.del()){
                return new DeleteLionExecutable(zoo);
            }
            else if (com.add()){
                return new CreateLionExecutable(zoo);
            }
            else if(com.end()){
                return new CommandExecutableEnd();
            }
        return new CommandExecutableTemp();
    }
}
