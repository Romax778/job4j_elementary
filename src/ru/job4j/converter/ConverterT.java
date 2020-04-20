package ru.job4j.converter;

public class ConverterT {




        public static int rubleToEuro(int value) {
            return value / 70;
        }

        public static int rubleToDollar(int value) {
            return value / 60;
        }

        public static int dollarToRuble(int value) {
            return value * 60;
        }
        public static int euroToRuble(int value) {
            return value * 70;
        }

        public static void main(String[] args) {
            int inEuro = 140;
            int expectedE = 2;
            int out = rubleToEuro(140);
            boolean passedE = expectedE == out;
            int inDollar = 120;
            int expectedD = 2;
            int outDollar = rubleToDollar(120);
            boolean passedD = expectedD == outDollar;
            int inRuble = 2;
            int expectedRd = 120;
            int outRubleD = dollarToRuble(2);
            boolean passedRd = expectedRd == outRubleD;
            int inRubleE = 2;
            int expectedRe = 140;
            int outRubleE = euroToRuble(2);
            boolean passedRe = expectedRe == outRubleE;
            System.out.println("140 rubles are " + out + " euro. Test result:" + passedE);
            System.out.println("120 rubles are" + outDollar + " dollars.Test result:" + passedD);
            System.out.println("2 dollars are " + outRubleD + " rubles. Test result:" + passedRd);
            System.out.println("2 euro are " + outRubleE + " rubles. Test result:" + passedRe);
        }
    }


