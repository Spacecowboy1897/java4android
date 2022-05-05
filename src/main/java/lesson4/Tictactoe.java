package lesson4;

import java.util.Random;
import java.util.Scanner;


public class Tictactoe {
    static final Scanner console = new Scanner(System.in);
    static int SIZE;
    static final char FIRST_STRING_SYM = '\u2663';
    static final String SPACE = " ";
    static final String DOT = "•";
    static String[][] ARRAY;
    final static String HUMAN_DOT = "X";
    final static String AI_DOT = "0";
    final static Random random = new Random();
    static int turnCount = 0;
    static int lastTurnRow = 0;
    static int lastTurnColumn = 0;
    static int counter = 0;


    public static void main(String[] args) {
        initGame();
        playGame();

    }

    public static void initGame() {
        int fieldNumber;
        while (true) {
            System.out.println("На каком поле будем играть? :");
            fieldNumber = console.nextInt();
            if (fieldNumber <= 2) {
                System.out.println("Игровое поле слишком маленькое");
            } else
                break;
        }
        SIZE = fieldNumber;
        ARRAY = new String[SIZE][SIZE];

        System.out.print(FIRST_STRING_SYM + SPACE);
        for (int i = 1; i <= fieldNumber; i++) {
            System.out.print(i + SPACE);
        }
        System.out.println();

        for (int i = 0; i < fieldNumber; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < fieldNumber; j++) {
                ARRAY[i][j] = DOT;
                System.out.print(ARRAY[i][j] + SPACE);
            }
            System.out.println();
        }
    }

    public static void playGame() {
        while (true) {
            turnHuman();
            if (checkEnd(HUMAN_DOT)) {
                break;
            }
            turnComputer();
            if (checkEnd(AI_DOT)) {
                break;
            }

        }

    }

    private static boolean checkEnd(String symbol) {

        if (checkWin(symbol, lastTurnRow, lastTurnColumn)) {
            if (symbol == HUMAN_DOT) {
                System.out.println("\n Победа человека");
            } else {
                System.out.println("\n Победа компьютера");
            }
            return true;
        }

        if (checkDraw(symbol)) {
            System.out.println("Ничья!");
            return true;
        }

        return false;
    }

    private static void printMap() {
        System.out.print(FIRST_STRING_SYM + SPACE);
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + SPACE);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(ARRAY[i][j] + SPACE);
            }
            System.out.println();
        }
    }

    private static void turnHuman() {
        System.out.println("Ход человека: ");
        int a;
        int b;
        while (true) {
            a = console.nextInt() - 1;
            b = console.nextInt() - 1;
            if (ARRAY[a][b].equals(DOT))
                break;
            else {
                System.out.println("Ячейка уже занята");
            }
        }
        ARRAY[a][b] = HUMAN_DOT;
        lastTurnRow = a;
        lastTurnColumn = b;
        turnCount++;
        printMap();
    }


    private static void turnComputer() {
        System.out.println("Ход компьютера: ");
        int a;
        int b;
        while (true) {
            a = random.nextInt(SIZE);
            b = random.nextInt(SIZE);
            if (ARRAY[a][b].equals(DOT))
                break;

        }
        ARRAY[a][b] = AI_DOT;
        lastTurnRow = a;
        lastTurnColumn = b;
        turnCount++;
        printMap();

    }


    private static boolean checkWin(String symbol, int lastTurnRow, int lastTurnColumn) {

        // if (ARRAY[0][0] == symbol && ARRAY[0][1] == symbol && ARRAY[0][2] == symbol) {
        //     return true;
        // }
        // if (ARRAY[1][0] == symbol && ARRAY[1][1] == symbol && ARRAY[1][2] == symbol) {
        //     return true;
        // }
        // if (ARRAY[2][0] == symbol && ARRAY[2][1] == symbol && ARRAY[2][2] == symbol) {
        //     return true;
        // }

        // if (ARRAY[0][0] == symbol && ARRAY[1][0] == symbol && ARRAY[2][0] == symbol) {
        //     return true;
        // }
        // if (ARRAY[0][1] == symbol && ARRAY[1][1] == symbol && ARRAY[2][1] == symbol) {
        //     return true;
        // }
        // if (ARRAY[0][2] == symbol && ARRAY[1][2] == symbol && ARRAY[2][2] == symbol) {
        //     return true;
        // }

        // if (ARRAY[0][0] == symbol && ARRAY[1][1] == symbol && ARRAY[2][2] == symbol) {
        //     return true;
        // }
        // if (ARRAY[0][2] == symbol && ARRAY[1][1] == symbol && ARRAY[2][0] == symbol) {
        //     return true;
        // }

        // return false;


        //проверяем горизонталь
        counter = 0;
        for (int i = 0; i < SIZE; i++) {

            if (symbol.equals(ARRAY[lastTurnRow][i])) {
                counter++;
            } else if (counter == 3) {
                return true;
            }
        }

        //проверяем вертикаль
        counter = 0;
        for (int i = 0; i < SIZE; i++) {
            if (symbol.equals(ARRAY[i][lastTurnColumn])) {
                counter++;
            } else if (counter == 3) {
                return true;
            }
        }


        // проверяем нисходящую диагональ
        counter = 0;
        for (int i = 0; i < SIZE; i++) {
            if (symbol.equals(ARRAY[i][i])) {
                counter++;
            } else if (counter == 3) {
                return true;
            }
        }


        // проверяем восходяющую диагональ
        counter = 0;
        for (int i = SIZE; i > 0; i--) {
            if (symbol.equals(ARRAY[i - 1][SIZE - i])) {
                counter++;
            } else if (counter == 3) {
                return true;
            }
        }
        return false;
    }


    private static boolean checkDraw(String symbol) {
        return turnCount == SIZE * SIZE;
    }

}

