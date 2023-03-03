package terminal;

import zoo.Zoo;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {
    public LogingCommandExecutableFactory(Zoo zoo) {
        super(zoo);
    }

    @Override
    public CommandExecutable create(Command com) {
        System.out.println("Начало");
        CommandExecutable comEx = super.create(com);
        System.out.println("Конец");
        return comEx;
    }
}
