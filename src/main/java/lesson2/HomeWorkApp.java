package lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(isSumBetween10and20(10, 11));
        System.out.println(isPositiveString(46));
        System.out.println(isNegative(-62));
        printFor("IDDQD", 10);
        System.out.println(ifYearLeap(1996));
    }


    public static boolean isSumBetween10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else
            return false;
    }

    public static String isPositiveString(int number) {
        if (number >= 0)
            return "Positive";
        else
            return "Negative";
    }

    public static boolean isNegative(int number) {
        if (number <= 0)
            return true;
        else
            return false;
    }

    public static void printFor(String str, int numberOfPrints) {
        while (numberOfPrints > 0) {
            System.out.println(str);
            numberOfPrints--;
        }
    }

    public static boolean ifYearLeap(int year) {
        if ((year % 4 == 0) && (!(year % 100 == 0) ^ year % 400 == 0))
            return true;
        else
            return false;
    }


}

