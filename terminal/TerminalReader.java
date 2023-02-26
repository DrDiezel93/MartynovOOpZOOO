package terminal;

import java.util.Scanner;

public class TerminalReader{

    private static TerminalReader terminalReader;

    private CommandParser commandParser;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }
    public static TerminalReader getTerminalReader(CommandParser commandParser){
        if(terminalReader == null){
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }
    void endLess(){
        Scanner iScanner = new Scanner(System.in);
        while (true){
            String input = iScanner.nextLine();
            commandParser.parserCommand(input);
            if(input.equals("end")) break;
        }
        iScanner.close();
    }
}
