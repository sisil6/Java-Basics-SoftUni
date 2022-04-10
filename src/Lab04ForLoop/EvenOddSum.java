/*Да се напише програма, която чете n-на брой цели числа,
подадени от потребителя и проверява дали сумата от числата на четни позиции е равна на сумата на числата на нечетни позиции.
Ако сумите са равни да се отпечатат два реда: "Yes" и на нов ред "Sum = " + сумата;
Ако сумите не са равни да се отпечат два реда: "No" и на нов ред "Diff = " + разликата.
Разликата се изчислява по абсолютна стойност. */

package Lab04ForLoop;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                sumEven = sumEven + num;
            } else {
                sumOdd = sumOdd + num;
            }
        }
        if(sumEven == sumOdd){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEven);
        }
        else{
            int difference = Math.abs(sumEven - sumOdd);
            System.out.println("No");
            System.out.printf("Diff = %d", difference);
        }
    }
}
