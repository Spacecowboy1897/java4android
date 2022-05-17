package lesson7;

import java.util.Random;

public class Cat {
    private String name = "Default cat";
    private boolean isSatisfied;
    private int satisfiedIndex = 20;
    private final Random random = new Random();

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int satisfiedIndex) {
        this.name = name;
        this.satisfiedIndex = satisfiedIndex;
    }

    public String getName() {
        return name;
    }

    public boolean getSatisfied() {
        return isSatisfied;
    }


    public void setSatisfied(boolean isSatisfied) {
        this.isSatisfied = isSatisfied;

    }

    public int getSatisfiedIndex() {
        return satisfiedIndex;
    }


    public void setSatisfiedIndex(int satisfiedIndex) {
        this.satisfiedIndex = satisfiedIndex;

    }

    public void printInfo() {
        System.out.println(this);
    }

    public String toString() {

        return "Котика зовут " + getName() + " Сытый ли он сегодня? " + getSatisfied();
    }


    public void eatFromPlate(Plate plate) {
        int catEatsAll = 0;
        if (getSatisfiedIndex() <= plate.getFoodCount()) {

            while (catEatsAll < satisfiedIndex) {
                int catEatsQuantity = random.nextInt(5) + 1;
                plate.decreaseFood(catEatsQuantity);
                catEatsAll = catEatsAll + catEatsQuantity;
                if (catEatsAll < satisfiedIndex) {
                    System.out.printf("Кот %s за один присест сожррал %d. Всего он съел %d мышей, но все еще голоден и продолжает жадно поедать...\n", getName(), catEatsQuantity, catEatsAll);
                    plate.printInfo();
                } else if (catEatsAll >= satisfiedIndex) {
                    System.out.printf("Наконец-то %s сыт!\n", getName());
                    setSatisfied(true);
                    System.out.printf("Всего жадное животное %s сожрало %d мышей!\n", getName(), catEatsAll);
                    plate.printInfo();
                    System.out.println();
                    break;
                }

            }

        } else {
            System.out.printf("В этой тарелке слишком мало еды для очень голодного %s! \n", getName());
            System.out.printf("Животное %s неистовствует!!! \n", getName());
        }

    }
}
