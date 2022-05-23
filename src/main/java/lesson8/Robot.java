package lesson8;

public class Robot implements Participant {
    public final int RUN_DISTANCE = 1000;
    public final int JUMP_HEIGHT = 5;
    public boolean isDead = false;
    private final String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void cross(Obstacle obstacle) {
        if (isDead) {
            return;
        }
        if (obstacle instanceof Track) {
            this.run(obstacle);
        } else if (obstacle instanceof Wall) {
            this.jump(obstacle);
        }
    }

    public void run(Obstacle track) {
        if (isDead) {
            return;
        } else if (track.getObstacleValue() <= RUN_DISTANCE)
            System.out.printf("Robot %s runs %d metres\n", getName(), track.getObstacleValue());
        else if (track.getObstacleValue() > RUN_DISTANCE) {
            System.out.printf("Robot %s is broken. Broken robot can not run or jump!\n", getName());
            isDead = true;
        }
    }


    public void jump(Obstacle wall) {
        if (isDead) {
            return;
        } else if (wall.getObstacleValue() <= JUMP_HEIGHT)
            System.out.printf("Robot %s jumps %d metres\n", getName(), wall.getObstacleValue());
        else if (wall.getObstacleValue() > JUMP_HEIGHT) {
            System.out.printf("Robot %s is broken. Broken robot can not run or jump!\n", getName());
            isDead = true;
        }
    }


}


