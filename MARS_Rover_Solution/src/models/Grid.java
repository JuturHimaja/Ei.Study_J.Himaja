package src.models;
public class Grid {
    private int width, height;
    private boolean[][] obstacles;

    public Grid(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Grid size must be positive.");
        }
        this.width = width;
        this.height = height;
        obstacles = new boolean[width][height];
    }

    public void addObstacle(int x, int y) {
        if (!isWithinBounds(x, y)) {
            throw new IllegalArgumentException("Obstacle position out of bounds.");
        }
        obstacles[x][y] = true;
    }

    public boolean isObstacle(int x, int y) {
        return obstacles[x][y];
    }

    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && y >= 0 && x < width && y < height;
    }
}
