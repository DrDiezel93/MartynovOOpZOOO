package terminal;

import zoo.Zoo;

import javax.swing.plaf.metal.MetalCheckBoxIcon;

public class CreateLionExecutable implements CommandExecutable{

    private Zoo zoo;

    public CreateLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.addLionInCage();
    }
}
