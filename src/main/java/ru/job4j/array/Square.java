package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i, 2);
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(5);
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("****************");
        int[] array1 = calculate(3);
        for (int i : array1) {
            System.out.println(i);
        }
    }
}