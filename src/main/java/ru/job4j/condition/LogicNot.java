package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean result = LogicNot.isEven(2);
        System.out.println(result);
        boolean result1 = LogicNot.isPositive(-2);
        System.out.println(result1);
        boolean result2 = LogicNot.notEven(3);
        System.out.println(result2);
        boolean result3 = LogicNot.notPositive(-3);
        System.out.println(result3);
        boolean result4 = LogicNot.notEvenAndPositive(5);
        System.out.println(result4);
        boolean result5 = LogicNot.evenOrNotPositive(4);
        System.out.println(result5);
    }
}
