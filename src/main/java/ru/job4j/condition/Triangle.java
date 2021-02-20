package ru.job4j.condition;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }


    public double period(double a, double b, double c) {
        double rsl = (a + b + c) / 2;
        return rsl;
    }


    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            // написать формулу для расчета площади треугольника.
            double res = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return res;

        }

        return rsl;

    }
//U triugolnika summa lubix dvux storon dolgna bit bolshe tretey.
    public boolean exist(double a, double b, double c) {
        if (a + b > c & b + c > a & c + a > b) {
            return true;
        }
        return false;
    }
}
