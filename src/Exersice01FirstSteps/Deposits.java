/*Напишете програма, която изчислява каква сума ще получите в края на депозитния период при определен лихвен процент. Използвайте следната формула:
сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
Вход
От конзолата се четат 3 реда:
1.	Депозирана сума – реално число в интервала [100.00 … 10000.00]
2.	Срок на депозита (в месеци) – цяло число в интервала [1…12]
3.	Годишен лихвен процент – реално число в интервала [0.00 …100.00]
Изход
Да се отпечата на конзолата сумата в края на срока.
*/

package Exersice01FirstSteps;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Deposits
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int depositPeriod = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        int totalPeriod = 12;
        double interestDouble = interest / 100;
        double depositInterestTotal = deposit * interestDouble;
        double depositInterestPerPeriod = depositInterestTotal / totalPeriod;
        double interestTotal = depositPeriod * depositInterestPerPeriod;
        double totalSum = deposit + interestTotal;
        System.out.println(df.format(totalSum));
    }
}

