/*Петър иска да купи N видеокарти, M процесора и P на брой рам памет.
Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка.
Важат следните цени:
Видеокарта – 250 лв./бр.
Процесор – 35% от цената на закупените видеокарти/бр.
Рам памет – 10% от цената на закупените видеокарти/бр.
Да се изчисли нужната сума за закупуване на материалите и да се пресметне дали бюджета ще му стигне.
Вход
Входът се състои от четири реда:
Бюджетът на Петър - реално число в интервала [0.0…100000.0]
Броят видеокарти - цяло число в интервала [0…100]
Броят процесори - цяло число в интервала [0…100]
Броят рам памет - цяло число в интервала [0…100]
Изход
На конзолата се отпечатва 1 ред, който трябва да изглежда по следния начин:
Ако бюджета е достатъчен:
"You have {остатъчен бюджет} leva left!"
Ако сумата надхвърля бюджета:
"Not enough money! You need {нужна сума} leva more!"
Резултатът да се форматира до втория знак след десетичната запетая.*/


package Exersice02ConditionalStatements;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int cards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double cardsCost = cards * 250;
        double processorsCost = processors * (cardsCost * 0.35 );
        double ramCost = ram * (cardsCost * 0.10);

        double totalCost = cardsCost + processorsCost + ramCost;
        if(cards >= processors){
            totalCost = totalCost - (totalCost * 0.15);
        }

        if (totalCost > budget) {
            double difference = Math.abs(totalCost - budget);
            System.out.printf("Not enough money! You need %.2f leva more!", difference);
        } else {
            double difference = Math.abs(budget - totalCost);
            System.out.printf("You have %.2f leva left!", difference);
        }
    }
}
