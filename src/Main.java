//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkNumbersSum(2, 13));
        checkPositiveOrNegative(5);
        System.out.println(checkBooleanPositiveOrNegative(6));
        changeZeroToOneArray();
        fillArray();
        mulArrayElements();
        printStringForLoop("What?", 5);
        int[] newArray = createArray(5, 12);
        for (Integer num : newArray) {
            System.out.println(num);
        }
        System.out.println(isLeapYear(2016));
        fillInMatrix();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 8;
        int result = a + b;
        if (result >= 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = -5;
        if (value <= 0) {
            System.out.println("красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("желтый");
        }
        if (value > 100) {
            System.out.println("зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 2;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");

        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkNumbersSum(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("число положительное");
        }
        if (a < 0) {
            System.out.println("число отрицательное");
        }
    }

    public static boolean checkBooleanPositiveOrNegative(int a) {
        boolean isPositive = false;
        if (a >= 0) {
            isPositive = false;
        }
        if (a < 0) {
            isPositive = true;
        }
        return isPositive;
    }

    public static void printStringForLoop(String anyString, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(anyString);
        }
    }

    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                isLeap = true;
            }
        }
        return isLeap;
    }

    public static void changeZeroToOneArray() {
        int[] initArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < initArray.length; i++) {
            if (initArray[i] == 1) {
                initArray[i] = 0;
            } else {
                initArray[i] = 1;
            }
        }
        for (Integer num : initArray) {
            System.out.print(num);
        }
    }

    public static void fillArray() {
        int[] initArray = new int[100];
        for (int i = 0; i < initArray.length; i++) {
            initArray[i] = i + 1;
        }
        System.out.println();
        for (Integer in : initArray) {
            System.out.println(in);
        }
    }

    public static void mulArrayElements() {
        int[] initArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < initArray.length; i++) {
            if (initArray[i] < 6) {
                initArray[i] = initArray[i] * 2;
            }
        }
        for (Integer num : initArray) {
            System.out.print(num + " ");
        }
    }

    public static void fillInMatrix() {
        int n = 5;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
            array[i][n - 1 - i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] initArray = new int[len];
        for (int i = 0; i < initArray.length; i++) {
            initArray[i] = initialValue;
        }
        return initArray;
    }
}