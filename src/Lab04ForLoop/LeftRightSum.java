/*Да се напише програма, която чете 2 * n-на брой цели числа, подадени от потребителя,
и проверява дали сумата на първите n числа (лява сума) е равна на сумата на вторите n числа (дясна сума).
При равенство печата " Yes, sum = " + сумата; иначе печата " No, diff = " + разликата.
Разликата се изчислява като положително число (по абсолютна стойност). */

package Lab04ForLoop;

import java.util.Scanner;

public class LeftRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum1 = sum1 + num;
        }
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum2 = sum2 + num;
        }

        if(sum1 == sum2){
            System.out.printf("Yes, sum = %d", sum1);
        }
        else{

            int difference = Math.abs(sum1 - sum2);
            System.out.printf("No, diff = %d", difference);
        }

    }
}
