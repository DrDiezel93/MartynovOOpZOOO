package terminal;

import zoo.Zoo;

import java.util.Scanner;

public class TerminalReader {

    private static TerminalReader terminalReader;

    private Zoo zoo;

    private CommandParser commandParser;

    private CommandExecutable comEx;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }


    public static TerminalReader getTerminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }
    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public void setCommandExecutable(Command command) {
        this.comEx = new CommandExecutableFactoryImpl(zoo).create(command);
    }

    public void endLess() {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите действие для льва: 'Добавить' 'Удалить' 'Конец'");
            String input = iScanner.nextLine();
            Command command = this.commandParser.parserCommand(input);
            this.setCommandExecutable(command);
            this.comEx.execute();
            if (input.equals("Конец")) break;
        }
        iScanner.close();
    }
}
