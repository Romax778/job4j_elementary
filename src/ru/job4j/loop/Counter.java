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


    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for ( int i = start; i <= finish; i++ ) {
            if (start == i % 2 ) {
                sum = sum + i ;
            }
        }
        return sum;
    }

    public static void main(String[] args) {


            System.out.println(sumByEven(0, 10));
            System.out.println(sumByEven(3, 8));
            System.out.println(sumByEven(1, 1));
        }
}
