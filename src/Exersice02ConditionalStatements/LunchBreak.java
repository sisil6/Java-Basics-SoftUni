/*По време на обедната почивка искате да изгледате епизод от своя любим сериал.
Вашата задача е да напишете програма, с която ще разберете дали имате достатъчно време да изгледате епизода.
По време на почивката отделяте време за обяд и време за отдих.
Времето за обяд ще бъде 1/8 от времето за почивка, а времето за отдих ще бъде 1/4 от времето за почивка.
Вход
От конзолата се четат 3 реда:
Име на сериал – текст
Продължителност на епизод  – цяло число в диапазона [10… 90]
Продължителност на почивката  – цяло число в диапазона [10… 120]
Изход
На конзолата да се изпише един ред:
	Ако времето е достатъчно да изгледате епизода:
	"You have enough time to watch {име на сериал} and left with {останало време} minutes free time."
	Ако времето не Ви е достатъчно:
	"You don't have enough time to watch {име на сериал}, you need {нужно време} more minutes."
	Времето да се закръгли до най-близкото цяло число нагоре. */

package Exersice02ConditionalStatements;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serialName = scanner.nextLine();
        int seriesMinutes = Integer.parseInt(scanner.nextLine());
        int breakMinutes = Integer.parseInt(scanner.nextLine());

        double lunchMinutes = breakMinutes * 0.125;
        double restMinutes = breakMinutes * 0.25;

        double timeForSerial = breakMinutes - (lunchMinutes + restMinutes);


       if (seriesMinutes <= timeForSerial) {
            double difference = Math.ceil(timeForSerial - seriesMinutes);
            int differenceR = (int) difference;
            System.out.print("You have enough time to watch " + serialName +" and left with " + differenceR + " minutes free time.");
        }
         else {
            double difference = Math.ceil(seriesMinutes - timeForSerial);
           int differenceR = (int) difference;
            System.out.println("You don't have enough time to watch " + serialName + ", you need " + differenceR + " more minutes.");
        }

    }
}
