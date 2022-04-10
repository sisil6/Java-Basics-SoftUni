/*Марин и Нели си купуват къща не далеч от София. Нели толкова много обича цветята,
че Ви убеждава да напишете програма която да изчисли колко  ще им струва,
да си засадят определен брой цветя и дали наличния бюджет ще им е достатъчен. Различните цветя са с различни цени.
Роза - 5.00
Далия - 3.80
Лале - 2.80
Нарцис - 3.00
Гладиола - 2.50
Съществуват следните отстъпки:
Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
От конзолата се четат 3 реда:
Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
Брой цветя - цяло число в интервала [10…1000]
Бюджет - цяло число в интервала [50…2500]
Да се отпечата на конзолата на един ред:
Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."
Сумата да бъде форматирана до втория знак след десетичната запетая.*/


package Exersice03AdvancedConditStatements;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double priceNoDiscount = 0;
        double discount = 0;
        double expence = 0;

        switch (flowersType) {
            case "Roses":
                priceNoDiscount = 5;
            if(flowersCount > 80){
                discount = 0.10;
            }
                break;
            case "Dahlias":
                priceNoDiscount = 3.80;
                if(flowersCount > 90){
                    discount = 0.15;
                }
                break;
            case "Tulips":
                priceNoDiscount = 2.80;
                if(flowersCount > 80){
                    discount = 0.15;
                }
                break;
            case "Narcissus":
                priceNoDiscount = 3;
                if(flowersCount < 120){
                    expence = 0.15;
                }
                break;
            case "Gladiolus":
                priceNoDiscount = 2.50;
                if(flowersCount < 80){
                    expence = 0.20;
                }
                break;
        }

        double flowersCost = priceNoDiscount * flowersCount;
        double flowersTotal = flowersCost - (flowersCost * discount) + (flowersCost * expence);


        if(flowersTotal > budget){
            double difference = Math.abs(flowersTotal - budget);
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }
        else{
            double difference = Math.abs(budget - flowersTotal);
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowersType, difference);
        }




    }
}
