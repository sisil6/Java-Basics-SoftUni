/*Трима спортни състезатели финишират за някакъв брой секунди (между 1 и 50).
Да се напише програма, която чете времената на състезателите в секунди,
въведени от потребителя и пресмята сумарното им време във формат "минути:секунди".
Секундите да се изведат с водеща нула (2  "02", 7  "07", 35  "35").
 */

package Exersice02ConditionalStatements;
import java.util.Scanner;
public class SecondsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int sumInSeconds = a+b+c;
        int minutes = sumInSeconds/60;
        int seconds = sumInSeconds % 60;
        if(seconds< 10)
        {
            System.out.printf("%d:0%d", minutes, seconds);
        }
        else{
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
