package lesson10;

import java.util.Arrays;

public class ChangeableArray<T> {

    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void changeArrayIndex(T[] array, int index1, int index2) {
        T temp;
        temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }

    public String toString() {
        array = getArray();
        return (getClass() + " " +  Arrays.toString(array));
    }


    public static void main(String[] args) {
        //Создаем два объекта класса ChangeableArray
       ChangeableArray<String> strArray = new ChangeableArray<>();
       ChangeableArray<Integer> intArray = new ChangeableArray<>();

       //создаем два массива - строковый и числовой
       String[] array = {"123", "gfgfg", "333333", "rtg3434gf"};
       Integer[] array2 = {1, 3, 5, 7, 9};

       // передаем массивы в объекты
       strArray.setArray(array);
       intArray.setArray(array2);

       //применяем метод
       strArray.changeArrayIndex(array, 0, 2);
       intArray.changeArrayIndex(array2, 0, 3);


       //выводим результат на экран
        System.out.println(intArray);
        System.out.println(strArray);
    }


}
