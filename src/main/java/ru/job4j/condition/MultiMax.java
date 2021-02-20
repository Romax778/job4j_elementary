package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first > second ? first : second;
        int result2 = result > third ? result : third;
        return result2;
    }

    public int max(int first, int second, int third, int fourth){
        int res = first > second ? first : second;
        int res2 = res > third ? res : third;
        int res3 = res2 > fourth ? res2 : fourth;
        return res3;
    }
}
