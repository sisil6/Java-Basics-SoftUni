/*Снимките за дългоочаквания филм "Годзила срещу Конг" започват. Сценаристът Адам Уингард ви моли да напишете програма,
която да изчисли дали предвидените средства са достатъчни за снимането на филма.
За снимките  ще бъдат нужни определен брой статисти, облекло за всеки един статист и декор.
Известно е, че:
Декорът за филма е на стойност 10% от бюджета.
При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.
Вход
От конзолата се четат 3 реда:
Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
Брой на статистите – цяло число в интервала [1 … 500]
Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]
Изход
На конзолата трябва да се отпечатат два реда:
Ако  парите за декора и дрехите са повече от бюджета:
"Not enough money!"
"Wingard needs {парите недостигащи за филма} leva more."
Ако парите за декора и дрехите са по малко или равни на бюджета:
"Action!"
"Wingard starts filming with {останалите пари} leva left."
Резултатът трябва да е форматиран до втория знак след десетичната запетая. */

package Exersice02ConditionalStatements;

import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble((scanner.nextLine()));
        int people = Integer.parseInt(scanner.nextLine());
        double clothesPricePerOnePerson = Double.parseDouble(scanner.nextLine());

        double clothesCost = clothesPricePerOnePerson * people;
        double decorCost = budget * 0.10;
        if (people > 150) {
            clothesCost = clothesCost - (clothesCost * 0.10);
        }
        double totalCosts = clothesCost + decorCost;

        if (totalCosts > budget) {
            double difference = Math.abs(totalCosts - budget);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        } else {
            double difference = Math.abs(budget - totalCosts);
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }
    }
}
