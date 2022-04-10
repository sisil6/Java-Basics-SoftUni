/*Да се напише програма, която проверява дали въведеното от потребителя число е в интервала [-100, 100]
и е различно от 0 и извежда "Yes", ако отговаря на условията, или "No" ако е извън тях.
 */
package Lab03AdvancedConditStatements;

import java.util.Scanner;

public class IntervalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (-100 <= number && number <= 100 && number != 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
