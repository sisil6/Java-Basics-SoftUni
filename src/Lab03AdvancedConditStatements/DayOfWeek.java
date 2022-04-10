/*Напишете програма, която чете цяло число, въведено от потребителя,
и отпечатва ден от седмицата (на английски език), в граници [1...7]
или отпечатва "Error" в случай, че въведеното число е невалидно.
 */

package Lab03AdvancedConditStatements;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());

        switch (day){
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.println("Thursday"); break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
            case 7:
                System.out.println("Sunday"); break;
            default:
                System.out.println("Error");
        }
    }

}
