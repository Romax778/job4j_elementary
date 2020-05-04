
package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoop2.indexOf(data, min, i, data.length);

           SwitchArray.swap(data, i, index);
        }
        return data;
    }

}