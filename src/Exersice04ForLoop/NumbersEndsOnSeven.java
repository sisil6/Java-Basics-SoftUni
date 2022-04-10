/*Напишете програма, която отпечатва числата в диапазона от 1 до 1000, които завършват на 7.*/
package Exersice04ForLoop;

import java.util.Scanner;

public class NumbersEndsOnSeven {
    public static void main(String[] args) {

        for (int i = 7; i <= 1000; i++) {
            if(i % 10 == 7)
            System.out.println(i);

        }
    }
}
