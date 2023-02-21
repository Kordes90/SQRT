package ru.netology.sqr;

public class SQRService {

    public int calc(int min, int max){
        int counter = 0;
        for (int i = 10; i <= 99; i++){
            int iSqrt = i * i;
            if (iSqrt >= min) {
                if (iSqrt <= max) {
                    counter++;
                }
            }
        }
        return counter;
    }

}

