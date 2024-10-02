package src.commands;

import src.models.Rover;

public class MoveCommand implements RoverCommand {
    private Rover rover;

    public MoveCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.move();
    }
}
