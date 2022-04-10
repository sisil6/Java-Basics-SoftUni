/*Напише конзолна програма, която чете оценка (цяло число),
въведена от потребителя и отпечатва "Excellent!" ако оценката е 5 или по-висока.
 */

package Lab02ConditionalStatements;

import java.util.Scanner;

public class ExcelentGrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        if ( a >=5) System.out.println("Excellent!");
    }
}
