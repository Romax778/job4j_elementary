package ru.job4j.converter;

/**
 * Class for calculating  exchange rate
 * @author fetisov
 * @since 16.04.2019
 * @version 1
 */
public class Converter {
    /**
     *
     * @param value
     * @return rubleToEuro plus value
     */

    public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

    /**
     *
     * @param value
     * @return rubleToDollar plus value
     */
        public static int rubleToDollar(int value) {
            int rsl = value / 60;
            return rsl;
        }

    /**
     * Main
     * @param args-args
     */
        public static void main(String[] args) {
            int euro = Converter.rubleToEuro(140);
            System.out.println("140 rubles are " + euro + " euro.");
            int dollar = Converter.rubleToDollar(420);
            System.out.println("420 rubles are " + dollar + " dollar.");
        }
    }

