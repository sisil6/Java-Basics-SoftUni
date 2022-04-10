/*Дадено число е валидно, ако е в диапазона [100…200] или е 0.
Да се напише програма, която чете цяло число, въведено от потребителя,
и печата "invalid" ако въведеното число не е валидно.
 */
package Lab03AdvancedConditStatements;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if(number !=0 && (100 > number || number > 200))
        {System.out.println("invalid");
        }

}
}
