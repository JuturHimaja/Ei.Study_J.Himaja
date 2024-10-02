import java.util.logging.Logger;

import src.commands.MoveCommand;
import src.commands.RoverCommand;
import src.commands.TurnLeftCommand;
import src.commands.TurnRightCommand;
import src.models.Direction;
import src.models.Grid;
import src.models.Rover;

public class MarsRoverSimulation {
    private static final Logger logger = Logger.getLogger(MarsRoverSimulation.class.getName());

    public static void main(String[] args) {
        try {
            // Define Grid and Obstacles
            Grid grid = new Grid(10, 10);
            grid.addObstacle(2, 2);
            grid.addObstacle(3, 5);

            // Initialize Rover at (0, 0) facing North
            Rover rover = new Rover(0, 0, Direction.N, grid);

            // Define Commands
            RoverCommand moveForward = new MoveCommand(rover);
            RoverCommand turnLeft = new TurnLeftCommand(rover);
            RoverCommand turnRight = new TurnRightCommand(rover);

            // Command sequence: Move, Move, Right, Move, Left, Move
            moveForward.execute();
            moveForward.execute();
            turnRight.execute();
            moveForward.execute();
            turnLeft.execute();
            moveForward.execute();

            // Report Rover's final position and status
            System.out.println(rover.reportStatus());
        } catch (IllegalArgumentException e) {
            logger.severe("Error initializing simulation: " + e.getMessage());
            System.err.println(e.getMessage());
        }
    }
}
