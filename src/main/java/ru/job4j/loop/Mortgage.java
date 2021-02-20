package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
double balance = amount;

        while(balance > 0) {
            double sum =balance + balance * (percent/100);
              balance = sum - salary;

     year++;

        }
        return year;

    }

}
