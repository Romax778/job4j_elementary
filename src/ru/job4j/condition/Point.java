package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;


public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public  double distance(Point that) {

        return (pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));

    }
    public double distance3d(Point that) {
        double distance = Math.sqrt(Math.pow((that.x - x), 2) + Math.pow((that.y - y), 2) + Math.pow((that.z - z),  2));;
         return 0;
    }
    public void info() {
        System.out.println(String.format("Point[%s, %s ,%s]", this.x, this.y, this.z));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(0, 2, 4);


        double dist = a.distance3d(c);
        System.out.println(dist);
    }
}

