package ru.job4j.condition;

public class ScArea {


        @SuppressWarnings("checkstyle:WhitespaceAfter")
        public static double square(int p, int k) {

            double s = 0;

            s = Math.pow(p/(2.0 * (k+1)),2)*k;
            return s;
        }

        public static void main(String[] args) {
            double result1 = square(6, 2);
            System.out.println(" s = " + result1);
        }
    }

