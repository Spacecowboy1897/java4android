package lesson3;

import java.util.Arrays;
import java.util.Random;


public class homeWorkApp {


    final static int[] ARRAY = {1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
    final static int[] ARRAY1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        arraysFirstTask();
        arraysSecondTask();
        arraysThirdTask();
        arraysFourthTask();
        System.out.println(Arrays.toString(arraysFifthTask(5, 25)));
        arraysSixthTask();
        System.out.println(arraysSeventhTask(ARRAY));
        arraysEighthTask(ARRAY1, 354);
    }

    public static void arraysFirstTask() {
        int[] array = {1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arraysSecondTask() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arraysThirdTask() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arraysFourthTask() {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i + j == array.length - 1) {
                    array[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[] arraysFifthTask(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void arraysSixthTask() {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(544);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Min: " + min + " " + "Max :" + max);
        System.out.println(Arrays.toString(array));
    }

    public static boolean arraysSeventhTask(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            int sum1 = 0;
            for (int j = array.length - 1; j > i; j--) {
                sum1 += array[j];
            }

            if (sum == sum1) {
                return true;
            }

        }
        return false;
    }

    public static void arraysEighthTask(int[] array, int shift) {
        if (shift == 0) {
            System.out.println(array);
        }
        if (shift > 0) {
            int size = array.length;

            if (shift > size) {
                shift = shift % size;
            }

            System.out.println("Сдвигаю массив влево на " + shift + " символ(ов)");
            for (int i = 0; i < shift; i++) {
                int temp = array[0];
                for (int j = 0; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = temp;
            }
            System.out.println(Arrays.toString(array));
        }

        if (shift < 0) {
            shift = Math.abs(shift);
            int size = array.length;

            if (shift > size) {
                shift = shift % size;
            }

            System.out.println("Сдвигаю массив вправо на " + shift + " символ(ов)");
            for (int i = 0; i < shift; i++) {
                int temp = array[size - 1];
                for (int j = size - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = temp;
            }
            System.out.println(Arrays.toString(array));
        }

    }

}

