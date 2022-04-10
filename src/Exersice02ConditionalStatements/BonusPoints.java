/*Дадено е цяло число – начален брой точки. Върху него се начисляват бонус точки по правилата,
описани по-долу. Да се напише програма, която пресмята бонус точките,
които получава числото и общия брой точки (числото + бонуса).
Ако числото е до 100 включително, бонус точките са 5.
Ако числото е по-голямо от 100, бонус точките са 20% от числото.
Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
Допълнителни бонус точки (начисляват се отделно от предходните):
За четно число  + 1 т.
За число, което завършва на 5  + 2 т.*/

package Exersice02ConditionalStatements;

import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b = Double.parseDouble(scanner.nextLine());
        double bonus = 0;
        if(b <= 100){
            bonus = 5;
        }
        else if(b > 100 && b<=1000){
            bonus =  b * 0.20;
        }
        else if(b > 1000){
            bonus = b * 0.10;
        }
       bonus = bonus;
        if(b %2 ==0){
            bonus = bonus + 1;
        }
        if(b % 10 == 5){
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(bonus+b);
    }
}
