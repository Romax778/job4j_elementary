package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        int i;
        for ( i = start; i <= finish; i++ ) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 10;

        System.out.println(sum(x, y));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}

