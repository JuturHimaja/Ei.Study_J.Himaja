package src.commands;
import src.models.Rover;


public class TurnRightCommand implements RoverCommand {
    private Rover rover;

    public TurnRightCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnRight();
    }
}
