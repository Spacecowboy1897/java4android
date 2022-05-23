package lesson8;

public class Wall implements Obstacle {
    private final int value;

    public Wall(int value) {
        this.value = value;
    }

    public int getObstacleValue() {
        return value;
    }
}
