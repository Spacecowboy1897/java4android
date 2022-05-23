package lesson8;

class Main {
    public static void main(String[] args) {
        Cat vaska = new Cat("Vaska");
        Human john = new Human("John");
        Robot bender = new Robot("Bender");

        Wall wall1 = new Wall(1);
        Track track1 = new Track(10);
        Wall wall2 = new Wall(3);
        Track track2 = new Track(500);
        Wall wall3 = new Wall(5);
        Track track3 = new Track(600);


        Participant[] arrayParticipants = {vaska, john, bender};
        Obstacle[] arrayObstacles = {track1, wall1, track2, wall2, track3, wall3};
        for (int j = 0; j < arrayParticipants.length; j++) {

            for (int i = 0; i < arrayObstacles.length; i++) {
                arrayParticipants[j].cross(arrayObstacles[i]);
            }
        }
    }
}