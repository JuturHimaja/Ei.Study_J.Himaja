package src.models;
import java.util.HashMap;
import java.util.Map;

public enum Direction {
    N, E, S, W;

    private static Map<Direction, Direction> leftTurn = new HashMap<>();
    private static Map<Direction, Direction> rightTurn = new HashMap<>();

    static {
        leftTurn.put(N, W);
        leftTurn.put(W, S);
        leftTurn.put(S, E);
        leftTurn.put(E, N);

        rightTurn.put(N, E);
        rightTurn.put(E, S);
        rightTurn.put(S, W);
        rightTurn.put(W, N);
    }

    public Direction turnLeft() {
        return leftTurn.get(this);
    }

    public Direction turnRight() {
        return rightTurn.get(this);
    }
}
