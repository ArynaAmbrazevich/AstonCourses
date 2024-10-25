
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println();

        checkSumSign();
        System.out.println();

        printColor();
        System.out.println();

        compareNumbers();
        System.out.println();

        System.out.println(checkNumbersSum(2, 13));
        System.out.println();

        checkPositiveOrNegative(5);
        System.out.println();

        System.out.println(checkBooleanPositiveOrNegative(6));
        System.out.println();

        printStringForLoop("What?", 5);
        System.out.println();

        changeZeroToOneArray();
        System.out.println();
        System.out.println();

        fillArray();
        System.out.println();
        System.out.println();

        mulArrayElements();
        System.out.println();
        System.out.println();

        int[] newArray = createArray(5, 12);
        for (Integer num : newArray) {
            System.out.println(num);
        }
        System.out.println();

        System.out.println(isLeapYear(2016));
        System.out.println();

        fillInMatrix();
    }

    public static void printThreeWords() {
        System.out.println("Первое задание:");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        System.out.println("Второе задание");
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
        System.out.println("Третье задание");
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
        System.out.println("Четвертое задание");
        int a = 2;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");

        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkNumbersSum(int a, int b) {
        System.out.println("Пятое задание");
        int result = a + b;
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkPositiveOrNegative(int a) {
        System.out.println("Шестое задание");
        if (a >= 0) {
            System.out.println("число положительное");
        }
        if (a < 0) {
            System.out.println("число отрицательное");
        }
    }

    public static boolean checkBooleanPositiveOrNegative(int a) {
        System.out.println("Седьмое задание");
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
        System.out.println("Восьмое задание");
        for (int i = 0; i < number; i++) {
            System.out.println(anyString);
        }
    }

    public static boolean isLeapYear(int year) {
        System.out.println("Девятое задание");
        boolean isLeap = false;
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                isLeap = true;
            }
        }
        return isLeap;
    }

    public static void changeZeroToOneArray() {
        System.out.println("Десятое задание");
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
        System.out.println("Одиннадцатое задание");
        int[] initArray = new int[100];
        for (int i = 0; i < initArray.length; i++) {
            initArray[i] = i + 1;
        }
        for (Integer in : initArray) {
            System.out.print(in);
        }
    }

    public static void mulArrayElements() {
        System.out.println("Двенадцатое задание");
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
        System.out.println("Тринадцатое задание");
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
        System.out.println("Четырнадцатое задание");
        int[] initArray = new int[len];
        for (int i = 0; i < initArray.length; i++) {
            initArray[i] = initialValue;
        }
        return initArray;
    }
}