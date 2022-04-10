/*Iван решава да подобри Световния рекорд по плуване на дълги разстояния. На конзолата се въвежда рекордът в секунди,
който Иван трябва да подобри,  разстоянието в метри, което трябва да преплува и времето в секунди,
за което плува разстояние от 1 м. Да се напише програма, която изчислява дали се е справил със задачата,
като се има предвид, че: съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди.
Когато се изчислява колко пъти Иван ще се забави, в резултат на съпротивлението на водата,
резултатът трябва да се закръгли надолу до най-близкото цяло число.
Да се изчисли времето в секунди, за което Иван ще преплува разстоянието и разликата спрямо Световния рекорд.
Вход
От конзолата се четат 3 реда:
Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]
Изход
Отпечатването на конзолата зависи от резултата:
Ако Иван е подобрил Световния рекорд (времето му е по-малко от рекорда) отпечатваме:
"Yes, he succeeded! The new world record is {времето на Иван} seconds."
Ако НЕ е подобрил рекорда (времето му е по-голямо или равно на рекорда) отпечатваме:
"No, he failed! He was {недостигащите секунди} seconds slower."
Резултатът трябва да се форматира до втория знак след десетичната запетая.*/

package Exersice02ConditionalStatements;

import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double oldRecord = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double seconds = distanceMeters * secondsPerMeter;
        double slow = 0;

        if (distanceMeters >= 15) {
            slow = (Math.floor(distanceMeters/15)) * 12.5;
        }

        double totalTime = seconds + slow;

        if (oldRecord > totalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            double difference = Math.abs(oldRecord - totalTime);
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);

        }
    }
}
