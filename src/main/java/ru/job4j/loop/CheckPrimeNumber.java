package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if(number==1){
            return true;
        }
        boolean prime = true;
        for(int i = 2; i < number; i++){
            if((number % i) == 0){
                prime = false;
                break;
            }
        }

        return prime ;
    }
}
