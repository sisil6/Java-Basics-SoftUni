/*Тони и приятели много обичали да ходят за риба, те са толкова запалени по риболова, че решават да отидат на риболов с кораб.
Цената за наема на кораба зависи от сезона и броя рибари.
   Цената зависи от сезона:
        Цената за наем на кораба през пролетта е  3000 лв.
        Цената за наем на кораба през лятото и есента е  4200 лв.
        Цената за наем на кораба през зимата е  2600 лв.
        В зависимост от броя си групата ползва отстъпка:
        Ако групата е до 6 човека включително  –  отстъпка от 10%.
        Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
        Ако групата е от 12 нагоре  –  отстъпка от 25%.
        Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.
        Напишете програма, която да пресмята дали рибарите ще съберат достатъчно пари.
        Вход
        От конзолата се четат точно три реда.
        Бюджет на групата – цяло число в интервала [1…8000]
        Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
        Брой рибари – цяло число в интервала [4…18]
        Изход
        Да се отпечата на конзолата един ред:
        Ако бюджетът е достатъчен:
        "Yes! You have {останалите пари} leva left."
        Ако бюджетът НЕ Е достатъчен:
        "Not enough money! You need {сумата, която не достига} leva."
        Сумите трябва да са форматирани с точност до два знака след десетичната запетая. */

        package Exersice03AdvancedConditStatements;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermenCount = Integer.parseInt(scanner.nextLine());


        double priceNoDiscount = 0;
        double additionalDiscount = 0;
        double discount = 0;


        switch (season) {
            case "Spring":
                priceNoDiscount = 3000;
                break;
            case "Summer":
            case "Autumn":
                priceNoDiscount = 4200;
                break;
            case "Winter":
                priceNoDiscount = 2600;
                break;
        }


        if(fishermenCount < 7){
            discount = 0.10;
        }
        else if(fishermenCount > 6 && fishermenCount < 12 )
        {
            discount = 0.15;
        }
        else if(fishermenCount >= 12) {
            discount = 0.25;
        }

        if(fishermenCount %2 == 0 && !season.equals("Autumn")){
            additionalDiscount = 0.05;
        }

        double totalCost = priceNoDiscount - (priceNoDiscount * discount);
        double  total = totalCost - (totalCost * additionalDiscount);

        if(total > budget){
            double difference = Math.abs(total - budget);
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }
        else{
            double difference = Math.abs(budget - total);
            System.out.printf("Yes! You have %.2f leva left.", difference);
        }


    }
}
