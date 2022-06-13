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
        // создадим две коробки с  апельсинами, одну с яблоками и взвесим их
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple(),new Apple(), new Apple(),new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange());
        Box<Orange> secondOrangeBox = new Box<>(new Orange(),new Orange(), new Orange());
        System.out.println("Коробка с яблоками весит " + appleBox.getWeight());
        System.out.println("Первая коробка с апельсинами весит " + orangeBox.getWeight());
        System.out.println("Вторая коробка с апельсинами весит " + secondOrangeBox.getWeight());
        System.out.println();
        System.out.println("Сравниваем вес коробок! ");
        System.out.println("Вес коробки с яблоками и первой коробки с апельсинаами одинаковый?: " + appleBox.compare(orangeBox));
        System.out.println("Вес коробки с яблоками и второй коробки с апельсинами одинаковый?: " + appleBox.compare(secondOrangeBox));
        //Пересыпаем апельсины
        orangeBox.replaceFruits(secondOrangeBox);
        System.out.println("Вес первой коробки с апельсинами составляет " + orangeBox.getWeight());
        System.out.println("Вес второй коробки с апельсинами составляет " + secondOrangeBox.getWeight());
    }


}
