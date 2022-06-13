package lesson10;
import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> {
   private ArrayList <T> fruitArray = new ArrayList<>();
    public Box(T... fruits) {
        fruitArray = new ArrayList<>(Arrays.asList(fruits));
    }

    public double getWeight() {
        double currentWeight = 0.0D;
        for (int i = 0; i <fruitArray.size(); i++) {
            currentWeight += fruitArray.get(i).getWeight();
        }
        return currentWeight;
    }
    public boolean compare (Box<? extends Fruit> fullBox) {

        return Math.abs(getWeight()-fullBox.getWeight()) < 0.0001D;
    }

    public void replaceFruits (Box<T> replace) {
        replace.fruitArray.addAll(this.fruitArray);
        fruitArray.clear();

    }

}
