/*Да се напише програма която чете ден от седмицата (текст) –
въведен от потребителя и принтира на конзолата цената на билет за кино според деня от седмицата:

 */
package Lab03AdvancedConditStatements;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Friday": System.out.println(12);
                break;
            case "Thursday":
            case "Wednesday": System.out.println(14);
                break;
            case "Saturday":
            case "Sunday":
                System.out.println(16);
                break;
        }
    }
}
