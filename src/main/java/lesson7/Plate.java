package lesson7;

public class Plate {
    private int foodCount;


    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public int getFoodCount() {
        return foodCount;

    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;

    }



    public void printInfo() {
        System.out.println(this);
    }

    public String toString () {
        int rem = this.getFoodCount();
        return " В тарелке осталось " + rem + " мышей";
    }

    public void decreaseFood (int catEatFood) {
        if(foodCount > 0) {
            this.foodCount = foodCount - catEatFood;
        }
    }

    public void addFood (int food) {
        this.setFoodCount(this.getFoodCount() + food);

    }

}
