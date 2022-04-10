/*Румен иска да пребоядиса хола и за целта е наел майстори. Напишете програма, която изчислява разходите за ремонта, предвид следните цени:
•	Предпазен найлон - 1.50 лв. за кв. метър
•	Боя - 14.50 лв. за литър
•	Разредител за боя - 5.00 лв. за литър
За всеки случай, към необходимите материали, Румен иска да добави още 10% от количеството боя и 2 кв.м. найлон, разбира се и 0.40 лв. за торбички. Сумата, която се заплаща на майсторите за 1 час работа, е равна на 30% от сбора на всички разходи за материали.
Вход
Входът се чете от конзолата и съдържа точно 4 реда:
1.	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
2.	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
3.	Количество разредител (в литри) - цяло число в интервала [1…30]
4.	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
Изход
Да се отпечата на конзолата един ред:
•	"{сумата на всички разходи}"
*/

package Exersice01FirstSteps;

import java.util.Scanner;

public class PaintingWall {

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int cover = Integer.parseInt(scanner.nextLine());
            int paint = Integer.parseInt(scanner.nextLine());
            int filler = Integer.parseInt(scanner.nextLine());
            int hours = Integer.parseInt(scanner.nextLine());
            double coverPrice = 1.5;
            double paintPrice = 14.50;
            double fillerPrice = 5.00;
            double bags = 0.40;
            double totalCover = cover + 2;
            double totalPaint = paint + (paint * 0.10);

            double coverSum = coverPrice * totalCover;
            double paintSum = paintPrice * totalPaint;
            double fillerSum = filler * fillerPrice;
            double totalNoWork = coverSum + paintSum + fillerSum + bags;
            double totalWorkPerHour = totalNoWork * 0.30;
            double totalWOrkSUm = hours * totalWorkPerHour;
            double total = totalNoWork + totalWOrkSUm;

            System.out.println(total);
        }
    }


