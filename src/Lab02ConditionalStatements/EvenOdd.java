/*Да се напише програма, която чете цяло число, въведено от потребителя и печата дали е четно или нечетно.
Ако е четно отпечатайте "even", ако е нечетно "odd".*/

package Lab02ConditionalStatements;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        if (a % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
