/*Напишете програма, която чете число n,
въведено от потребителя и отпечатва числата от 1 до n през 3.
 */

package Lab04ForLoop;

import java.util.Scanner;

public class OneNplusThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= n; i+=3){
            System.out.println(i);
        }

    }
}
