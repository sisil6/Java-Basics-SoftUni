/*Да се напише програма, която чете парола (текст), въведена от потребителя и проверява дали въведената парола
съвпада с фразата "s3cr3t!P@ssw0rd". При съвпадение да се изведе "Welcome".
При несъвпадение да се изведе "Wrong password!".
 */

package Lab02ConditionalStatements;

import java.util.Objects;
import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        if (Objects.equals(pass,"s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        }
        else{
            System.out.println("Wrong password!");
        }
    }
}