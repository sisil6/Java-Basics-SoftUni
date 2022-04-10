/*Да се напише програма, която чете час от денонощието(цяло число) и ден от седмицата(текст) -
въведени от потребителя и проверява дали офисът на фирма е отворен, като работното време на офисът е от 10-18 часа,
от понеделник до събота включително
 */

package Lab03AdvancedConditStatements;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Thursday":
            case "Wednesday":
            case "Friday":
            case "Saturday":
                if (10 <= hour && hour <= 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
                break;
            case "Sunday":
                System.out.println("closed");
                break;
        }
    }
}
