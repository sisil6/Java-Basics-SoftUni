/*Катерачи от цяла България се събират на групи и набелязват следващите върхове за изкачване.
Според размера на групата, катерачите ще изкачват различни върхове.
Група до 5 човека – изкачват Мусала
Група от 6 до 12 човека – изкачват Монблан
Група от 13 до 25 човека – изкачват Килиманджаро
Група от 26 до 40 човека –  изкачват К2
Група от 41 или повече човека – изкачват Еверест
Да се напише програма, която изчислява процента на катерачите изкачващи всеки връх.
Вход
От конзолата се четат поредица от числа, всяко на отделен ред:
На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]
Изход
Да се отпечатат на конзолата 5 реда, всеки от които съдържа процент между 0.00% и 100.00% с точност до втората цифра след десетичната запетая.
Първи ред - процентът изкачващи Мусала
Втори ред – процентът изкачващи Монблан
Трети ред – процентът изкачващи Килиманджаро
Четвърти ред – процентът изкачващи К2
Пети ред – процентът изкачващи Еверест
 */
package Exersice04ForLoop;

import java.util.Scanner;

public class Trekking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());


       int peopleTotal = 0;
       int musalaPeople = 0;
       int monblanPeople = 0;
       int kiliPeople = 0;
       int kPeople = 0;
       int everestPeople = 0;

        for (int i = 1; i <= groupsCount; i++) {
            int peopleCount = Integer.parseInt(scanner.nextLine());
            if(peopleCount <= 5){
                musalaPeople = musalaPeople + peopleCount;
            }
            else if(6 <= peopleCount && peopleCount <= 12){
                monblanPeople = monblanPeople + peopleCount;
            }
            else if(13 <= peopleCount && peopleCount <= 25){
                kiliPeople = kiliPeople + peopleCount;
            }
            else if(26 <= peopleCount && peopleCount <= 40)
            {
                kPeople = kPeople + peopleCount;
            }
            else{
                everestPeople = everestPeople+ peopleCount;
            }
            peopleTotal = peopleTotal + peopleCount;
        }


        double n = 100;
        double musalaPercent = ((double)musalaPeople / (double)peopleTotal) * n;
        double monblanPercent = ((double)monblanPeople / (double)peopleTotal) * n;
        double kiliPercent =  ((double)kiliPeople / (double)peopleTotal)* n;
        double kPercent =  ((double) kPeople/(double) peopleTotal) *n;
        double everestPercent =  ((double)everestPeople/ (double) peopleTotal) * n;



        System.out.printf("%.2f", musalaPercent);
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f", monblanPercent);
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f", kiliPercent);
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f", kPercent);
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f", everestPercent);
        System.out.print("%");

    }
}
