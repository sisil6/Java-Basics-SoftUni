/*Напишете програма, която чете цяло положително число n, въведено от потребителя и печата числата от n до 1 в обратен ред.
Въведеното число n, винаги ще бъде по-голямо от 1.
 */
package Lab04ForLoop;

import java.util.Scanner;

public class NOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }

    }
}
