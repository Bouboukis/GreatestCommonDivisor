package com.georgioskachrimanis.javacourse;

public class GreatestCommonDivisor {


    public static int getGreatestCommonDivisor(int number1, int number2) {
        if (number1 < 10 || number2 < 10) {
            return -1;
        }

        do {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }

        } while (number1 != number2);
        return number1;
    }

}
