package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i; // указатель, на не null ячейку.
                // переместить первую не null ячейку
                // Здесь нужен цикл while
                while(point != array.length){
                  if (array[point] != null){
                      array[i] = array[point];
                      array[point]=null;
                      break;
                  }
                  point++;
                }

            }
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
