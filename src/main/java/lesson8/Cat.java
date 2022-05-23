package lesson8;

public class Cat implements Participant {
    public final int RUN_DISTANCE = 100;
    public final int JUMP_HEIGHT = 2;
    private final String name;
    public boolean isDead = false;

    public Cat(String name) {
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

        if (track.getObstacleValue() <= RUN_DISTANCE)
            System.out.printf("Cat %s runs %d metres\n", getName(), track.getObstacleValue());
        else if (track.getObstacleValue() > RUN_DISTANCE) {
            System.out.printf("The cat %s is dead. Dead cat can not run or jump!\n", getName());
            isDead = true;
        }
    }


    public void jump(Obstacle wall) {
        if (isDead) {
            return;
        } else if (wall.getObstacleValue() <= JUMP_HEIGHT)
            System.out.printf("Cat %s jumps %d metres\n", getName(), wall.getObstacleValue());
        else if (wall.getObstacleValue() > JUMP_HEIGHT) {
            System.out.printf("The cat %s is dead. Dead cat can not run or jump!\n", getName());
            isDead = true;
        }
    }


}