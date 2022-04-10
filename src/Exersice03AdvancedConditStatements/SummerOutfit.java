/*Лято е с много променливо време и Виктор има нужда от вашата помощ. Напишете програма която спрямо времето от денонощието и градусите да препоръча на Виктор какви дрехи да си облече. Вашия приятел има различни планове за всеки етап от деня,
които изискват и различен външен вид, тях може да видите от таблицата.
От конзолата се четат точно два реда:
Градусите - цяло число в интервала [10…42]
Текст, време от денонощието - с възможности - "Morning", "Afternoon", "Evening"
Време от денонощието / градуси - 10 <= градуси <= 18
 18 < градуси <= 24
градуси >= 25
се отпечата на конзолата на един ред: "It's {градуси} degrees, get your {облекло} and {обувки}." */

package Exersice03AdvancedConditStatements;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String timeOfTheDay = scanner.nextLine();
        String outfit = "";
        String shoes = "";
        if (10 <= degrees && degrees <= 18) {
            switch (timeOfTheDay) {
                case "Morning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case "Afternoon":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }
        else if (18 < degrees && degrees <= 24) {
            switch (timeOfTheDay) {
                case "Morning":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
            }
        }
        else {
            switch (timeOfTheDay) {
                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }

        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);

    }
}
