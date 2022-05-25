package lesson9;

import java.util.Arrays;


class myArraySizeException extends Exception {
    public myArraySizeException() {
        System.err.println("Invanlid size of the array");
    }
}

class myArrayDataException extends Exception {
    public myArrayDataException(int i, int j) {
        System.out.printf("Invanlid data in cell [%d : %d]\n", i, j);
    }
}


class Main {

    public static void main(String[] args) {
        String[][] array = new String[4][4];

        for (int i = 0; i < array.length; i++) {
            Arrays.fill(array[i], "123");
        }

        String[][] array2 = new String[3][4];

        String[][] array3 = new String[4][4];

        for (int i = 0; i < array.length; i++) {
            Arrays.fill(array3[i], "321");
        }
        array3[0][3] = "ddfdbdf";


        try {
            myArraySizeMethod(array);
            myArraySizeMethod(array2);
        } catch (myArraySizeException e) {
        } catch (myArrayDataException e2) {
        } finally {
            System.out.println("End of try/catch unit");
        }

        try {

            myArraySizeMethod(array3);
        } catch (myArraySizeException e) {
        } catch (myArrayDataException e2) {
        } finally {
            System.out.println("End of the try/catch unit");
        }
    }


    public static void myArraySizeMethod(String[][] myArray) throws myArraySizeException, myArrayDataException {
        int result = 0;
        if (myArray.length == 4 && myArray[0].length == 4) {

            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    if (isNumeric(myArray[i][j])) {
                        result = result + Integer.parseInt(myArray[i][j]);
                    } else {
                        throw new myArrayDataException(i, j);
                    }
                }

            }
            System.out.println(result);


        } else {
            throw new myArraySizeException();
        }
    }

    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException exc) {
            return false;
        }
        return true;
    }


}
