/*Петя има магазин за детски играчки. Тя получава голяма поръчка, която трябва да изпълни.
С парите, които ще спечели иска да отиде на екскурзия.
Цени на играчките:
Пъзел - 2.60 лв.
Говореща кукла - 3 лв.
Плюшено мече - 4.10 лв.
Миньон - 8.20 лв.
Камионче - 2 лв.
Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
От спечелените пари Петя трябва да даде 10% за наема на магазина.
Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.
Вход
От конзолата се четат 6 реда:
Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
Брой пъзели - цяло число в интервала [0… 1000]
Брой говорещи кукли - цяло число в интервала [0 … 1000]
Брой плюшени мечета - цяло число в интервала [0 … 1000]
Брой миньони - цяло число в интервала [0 … 1000]
Брой камиончета - цяло число в интервала [0 … 1000]
Изход
На конзолата се отпечатва:
Ако парите са достатъчни се отпечатва:
"Yes! {оставащите пари} lv left."
Ако парите НЕ са достатъчни се отпечатва:
"Not enough money! {недостигащите пари} lv needed."
Резултатът трябва да се форматира до втория знак след десетичната запетая. */

package Exersice02ConditionalStatements;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double trip = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        int totalCount = puzzlesCount + dollsCount + bearsCount + minionsCount + trucksCount;

        double puzzlesCost = puzzlesCount * 2.60;
        double dollsCost = dollsCount * 3.00;
        double bearsCost = bearsCount * 4.10;
        double minionsCost = minionsCount * 8.20;
        double trucksCost = trucksCount * 2.00;

        double totalCost = puzzlesCost + dollsCost + bearsCost + minionsCost + trucksCost;
         if(totalCount >= 50){
             totalCost = totalCost - (totalCost * 0.25);
         }
        totalCost = totalCost - (totalCost * 0.10);


         if(totalCost >= trip){
             double difference = Math.abs(totalCost - trip);
             System.out.printf("Yes! %.2f lv left.", difference);
         }
         else{
             double difference = Math.abs(trip - totalCost);
             System.out.printf("Not enough money! %.2f lv needed.", difference);
                      }
    }
}
