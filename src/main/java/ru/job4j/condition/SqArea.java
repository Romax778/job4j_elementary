package ru.job4j.condition;

public class SqArea {


       // @SuppressWarnings("checkstyle:WhitespaceAfter")
        @SuppressWarnings("checkstyle:ParenPad")
        public static int square(int p, int k) {
int h = p / (2 * (k + 1));
int w = k * h;
int s = w * h;
return s;
           // return Math.pow(p, 2.0) / (4 * k * Math.pow(1.0 + 1 / k, 2.0));
        }

        public static void main(String[]args) {
            double result1 = square(6, 2);
            System.out.println(" s = " + result1);
        }
    }




