/*Да се напише програма, която чете час и минути от 24-часово денонощие, въведени от потребителя и изчислява
колко ще е часът след 15 минути. Резултатът да се отпечата във формат часове:минути.
Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59. Часовете се изписват с една или две цифри.
Минутите се изписват винаги с по две цифри, с водеща нула, когато е необходимо.
 */

package Exersice02ConditionalStatements;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int timeInMinutes = (hour *60) + min +15;
        int newHour = timeInMinutes / 60;
        if(newHour > 23)
        {
            newHour = 0;
        }
        int newMin = timeInMinutes % 60;
        if(newMin < 10 ){
            System.out.printf("%d:0%d", newHour, newMin);
        }
        else {
            System.out.printf("%d:%d", newHour, newMin);
        }

    }
}
