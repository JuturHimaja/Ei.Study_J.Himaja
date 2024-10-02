package src.commands;

import src.models.Rover;

public class TurnLeftCommand implements RoverCommand {
    private Rover rover;

    public TurnLeftCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnLeft();
    }
}
