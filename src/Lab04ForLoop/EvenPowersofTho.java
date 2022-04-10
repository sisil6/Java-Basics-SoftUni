/*Да се напише програма, която чете число n,
въведено от потребителя и печата четните степени на 2 ≤ 2n: 20, 22, 24, 26, …, 2n
 */
package Lab04ForLoop;

import java.util.Scanner;

public class EvenPowersofTho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;
        for(int i = 0; i <= n; i+=2){
            System.out.println(num);
            num = num * 2 * 2;
        }

    }
}
