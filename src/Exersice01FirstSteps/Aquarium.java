/*За рождения си ден Любомир получил аквариум с формата на паралелепипед. Първоначално прочитаме от конзолата на отделни редове размерите му –
дължина, широчина и височина в сантиметри. Трябва да се пресметне колко литра вода ще събира аквариума, ако се знае,
че определен процент от вместимостта му е заета от пясък, растения, нагревател и помпа.
Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.
Да се напише програма, която изчислява литрите вода, която са необходими за напълването на аквариума.
Вход
От конзолата се четат 4 реда:
1.	Дължина в см – цяло число в интервала [10 … 500]
2.	Широчина в см – цяло число в интервала [10 … 300]
3.	Височина в см – цяло число в интервала [10… 200]
4.	Процент  – реално число в интервала [0.000 … 100.000]
Изход
Да се отпечата на конзолата едно число:
•	литрите вода, които ще събира аквариума.
*/

package Exersice01FirstSteps;
import java.util.Scanner;
public class Aquarium {
       public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            double a = Integer.parseInt(scanner.nextLine());
            double b = Integer.parseInt(scanner.nextLine());
            double h = Integer.parseInt(scanner.nextLine());
            double percentage = Double.parseDouble(scanner.nextLine());

            double percentageNum = percentage /100;
            double volumeFull = a * b * h;
            double volumeLiters = volumeFull / 1000;
            double percentageFill = volumeLiters - (volumeLiters * percentageNum);
            System.out.println(percentageFill);
        }
    }
