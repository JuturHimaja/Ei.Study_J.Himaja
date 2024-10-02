package src.models;
import java.util.logging.Logger;

public class Rover {
    private int x, y;
    private Direction direction;
    private Grid grid;
    private static final Logger logger = Logger.getLogger(Rover.class.getName());

    public Rover(int x, int y, Direction direction, Grid grid) {
        if (!grid.isWithinBounds(x, y)) {
            throw new IllegalArgumentException("Invalid starting position: (" + x + ", " + y + ")");
        }
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
        logger.info("Rover initialized at (" + x + ", " + y + ") facing " + direction);
    }

    public void move() {
        try {
            if (canMove()) {
                switch (direction) {
                    case N -> y++;
                    case E -> x++;
                    case S -> y--;
                    case W -> x--;
                }
                logger.info("Rover moved to (" + x + ", " + y + ")");
            } else {
                throw new RuntimeException("Obstacle detected! Cannot move.");
            }
        } catch (RuntimeException e) {
            logger.severe(e.getMessage());
            System.err.println(e.getMessage());
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
        logger.info("Rover turned left. Now facing " + direction);
    }

    public void turnRight() {
        direction = direction.turnRight();
        logger.info("Rover turned right. Now facing " + direction);
    }

    private boolean canMove() {
        int newX = x, newY = y;
        switch (direction) {
            case N -> newY++;
            case E -> newX++;
            case S -> newY--;
            case W -> newX--;
        }
        return grid.isWithinBounds(newX, newY) && !grid.isObstacle(newX, newY);
    }

    public String reportStatus() {
        return "Rover is at (" + x + ", " + y + ") facing " + direction + ".";
    }
}
