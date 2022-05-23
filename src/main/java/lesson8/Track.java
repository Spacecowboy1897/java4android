package lesson8;

public class Track implements Obstacle {
    private final int value;

    public Track(int value) {
        this.value = value;
    }

    public int getObstacleValue() {
        return value;
    }

}
