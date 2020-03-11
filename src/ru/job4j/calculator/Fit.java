package ru.job4j.calculator;

public class Fit {

        public static double manWeight(double height) {
            double rsl = (height - 100) * 1.15;
            return rsl;
        }


        public static double womanWeight(double height) {
            double rsl = (height-110) * 1.15;
            return rsl;
        }

        public static void main(String[] args) {
            double man = Fit.manWeight(187);
            System.out.println("Man 187 is " + man);
            double woman = Fit.womanWeight(172);
            System.out.println("Woman 172 is " + woman);
        }

    }

