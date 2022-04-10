/*Да се напише програма, която чете скорост (реално число), въведена от потребителя и отпечатва информация за скоростта.
При скорост до 10 (включително) отпечатайте "slow"
При скорост над 10 и до 50 (включително) отпечатайте "average"
При скорост над 50 и до 150 (включително) отпечатайте "fast"
При скорост над 150 и до 1000 (включително) отпечатайте "ultra fast"
При по-висока скорост отпечатайте "extremely fast"*/

package Lab02ConditionalStatements;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());

        if (speed <= 10) {
            System.out.println("slow");
        } else if (10 < speed && speed <= 50) {
            System.out.println("average");
        } else if (50 < speed && speed <= 150) {
            System.out.println("fast");
        } else if (150 < speed && speed <= 1000) {
            System.out.println("ultra fast");
        } else if (speed > 1000) {
            System.out.println("extremely fast");
        }
    }
}
