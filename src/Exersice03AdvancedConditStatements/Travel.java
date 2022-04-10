/*Странно, но повечето хора си плануват от рано почивката. Млад програмист разполага с определен бюджет и свободно време в даден сезон.
Напишете програма, която да приема на входа бюджета и сезона, а на изхода да изкарва, къде ще почива програмиста и колко ще похарчи.
Бюджета определя дестинацията, а сезона определя колко от бюджета ще изхарчи. Ако е лято ще почива на къмпинг, а зимата в хотел.
Ако е в Европа, независимо от сезона ще почива в хотел.
Всеки къмпинг или хотел, според дестинацията, има собствена цена която отговаря на даден процент от бюджета:
При 100лв. или по-малко – някъде в България
Лято – 30% от бюджета
Зима – 70% от бюджета
При 1000лв. или по малко – някъде на Балканите
Лято – 40% от бюджета
Зима – 80% от бюджета
При повече от 1000лв. – някъде из Европа
При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.
Вход
Входът се чете от конзолата и се състои от два реда, въведени от потребителя:
Първи ред – Бюджет, реално число в интервала [10.00...5000.00].
Втори ред –  Един от двата възможни сезона: "summer" или "winter"
Изход
На конзолата трябва да се отпечатат два реда.
Първи ред – "Somewhere in {дестинация}" измежду "Bulgaria", "Balkans" и "Europe"
Втори ред – "{Вид почивка} – {Похарчена сума}"
Почивката може да е между "Camp" и "Hotel"
Сумата трябва да е закръглена с точност до вторият знак след десетичната запетая */

package Exersice03AdvancedConditStatements;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String place = "";
        double price = 0;

        if(budget <= 100){
            destination = "Bulgaria";
            switch (season)
            {
                case "summer":
                    price = budget * 0.30;
                    place = "Camp";
                    break;
                case "winter":
                    price = budget * 0.70;
                    place = "Hotel"; break;

            }
        }
        else if (100 < budget && budget <= 1000){
            destination = "Balkans";
            switch (season)
            {
                case "summer":
                    price = budget * 0.40;
                    place = "Camp";
                    break;
                case "winter":
                    price = budget * 0.80;
                    place = "Hotel"; break;
            }
        }
        else{
            destination = "Europe";
            price = budget * 0.90;
            place = "Hotel";
        }

        System.out.println("Somewhere in " + destination );
        System.out.printf(place + " - " + "%.2f", price);

    }
}
