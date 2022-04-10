/*Напишете програма за конвертиране на щатски долари (USD) в български лева (BGN). Използвайте фиксиран курс между долар и лев: 1 USD = 1.79549 BGN.*/

package Exersice01FirstSteps;
import java.util.Scanner;
public class USDtoBGN
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = 1.79549;
        double usdToBgn = usd * bgn;
        System.out.println(usdToBgn);
    }
}
