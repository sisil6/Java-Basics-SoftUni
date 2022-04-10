/*Ресторант отваря врати и предлага няколко менюта на преференциални цени:
•	Пилешко меню –  10.35 лв.
•	Меню с риба – 12.40 лв.
•	Вегетарианско меню  – 8.15 лв.
Напишете програма, която изчислява колко ще струва на група хора да си поръчат храна за вкъщи.
Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
Цената на доставка е 2.50 лв и се начислява най-накрая.
Вход
От конзолата се четат 3 реда:
•	Брой пилешки менюта – цяло число в интервала [0 … 99]
•	Брой менюта с риба – цяло число в интервала [0 … 99]
•	Брой вегетариански менюта – цяло число в интервала [0 … 99]
Изход
Да се отпечата на конзолата един ред:  "{цена на поръчката}"
*/

package Exersice01FirstSteps;

import java.util.Scanner;

public class FoodDelivery {

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int chickenCount = Integer.parseInt(scanner.nextLine());
            int fishCount = Integer.parseInt(scanner.nextLine());
            int vegeCont = Integer.parseInt(scanner.nextLine());

            double chickenPrice = 10.35;
            double fishPrice = 12.40;
            double vegePrice = 8.15;
            double delivery = 2.50;

            double chickenSum = chickenCount * chickenPrice;
            double fishSum = fishCount * fishPrice;
            double vegeSum = vegeCont * vegePrice;
            double sumNodesert = chickenSum + fishSum + vegeSum;
            double desertSum = sumNodesert * 0.20;
            double total = sumNodesert + desertSum + delivery;
            System.out.println(total);
        }
    }
