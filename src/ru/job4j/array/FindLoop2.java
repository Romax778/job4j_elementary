package ru.job4j.array;

public class FindLoop2 {


    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                return i;
            }

        }
        return rst;
    }
}
