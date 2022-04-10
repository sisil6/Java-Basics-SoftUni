/*Напишете програма, която чете текст (стринг),
въведен от потребителя и печата всеки символ от текста на отделен ред.
 */
package Lab04ForLoop;

import java.util.Scanner;

public class CharacterSequesnce {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int len = text.length();

        for(int i = 0; i < len; i++) {
            char symbol = text.charAt(i);
            System.out.println(symbol);
        }
    }
}
