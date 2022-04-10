/*Да се напише програма, която чете n-на брой цели числа, въведени от потребителя,
и проверява дали сред тях съществува число, което е равно на сумата на всички останали.
Ако има такъв елемент печата "Yes" и на нов ред "Sum = "  + неговата стойност
Ако няма такъв елемент печата "No" и на нов ред "Diff = " + разликата между най-големия елемент и сумата на останалите (по абсолютна стойност)
*/

package Exersice04ForLoop;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNum = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > maxNum)
            {
                maxNum = num;
            }
            sum = sum + num;
        }
        sum = sum - maxNum;

        if(sum == maxNum){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        }
        else{
            int difference = Math.abs(sum - maxNum);
            System.out.println("No");
            System.out.printf("Diff = %d", difference);
        }
    }
}
