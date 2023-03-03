package terminal;

public class ParserCommand implements CommandParser{
    @Override
    public Command parserCommand(String inputCommand) {
        return new Command(inputCommand);
    }
}
