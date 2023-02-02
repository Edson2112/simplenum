package ua.edson.simplenum;

// Ввести с консоли 1 число. Определить, является ли число простым.
// Простое число - число, которое нацело делится на 1 и на само себя, и больше ни на что.

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        Integer value = scanner.nextInt();

        // int value = 367;
        boolean result = isSimple(value);
        int result1 = printResult(value);

        System.out.print("Введённое число " + result1 + " является: ");
        System.out.println(result);
    }

    public static boolean isSimple(int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
            }
        }
        return result;
    }

    public static int printResult(int value) {
        boolean res;
        if (res = isSimple(value) == true) {
            System.out.println("Введённое число " + value + " простое ");
        } else {
            System.out.println("Введённое число " + value + " не простое ");
        }
        return value;
    }
}
