package ru.job4j.array;

import java.util.Arrays;

public class SwitchArraySwap {
    public static int[] swap(int[] array, int source, int dest) {
       int temp = array[dest] ;
       array[dest]=array[source] ;
       array[source]= temp;

        return array;
    }
    public static void main(String[]args){
        int[]nums =  {1,3,5,7,9};
        int x = 0 ;
        int y= nums.length-1 ;
       nums =  swap(nums, x,y);
       System.out.println(Arrays.toString(nums));
    }
}






