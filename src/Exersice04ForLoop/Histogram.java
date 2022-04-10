/*Дадени са n цели числа в интервала [1…1000]. От тях някакъв процент p1 са под 200,
друг процент p2 са от 200 до 399, друг процент p3 са от 400 до 599,
друг процент p4 са от 600 до 799 и останалите p5 процента са от 800 нагоре.
Да се напише програма, която изчислява и отпечатва процентите p1, p2, p3, p4 и p5.
Вход
На първия ред от входа стои цялото число n (1 ≤ n ≤ 1000) – брой числа.
На следващите n реда стои по едно цяло число в интервала [1…1000] – числата върху които да бъде изчислена хистограмата.
Изход
Да се отпечата на конзолата хистограмата – 5 реда, всеки от които съдържа число между 0% и 100%,
с точност две цифри след десетичната точка, например 25.00%, 66.67%, 57.14%.
 */

package Exersice04ForLoop;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if(num < 200){
                count1 = count1 +1;
            }
            else if(200<= num && num <=399){
                count2 = count2 +1;
            }
            else if(400 <= num && num <= 599){
                count3 = count3 +1;
            }
            else if(600 <= num && num <=799){
                count4 = count4 +1;
            }
            else{
                count5 = count5 +1;
            }
        }

        double p1 = (double)count1 /n *100;
        double p2 = (double)count2 /n *100;
        double p3 = (double)count3 /n *100;
        double p4 = (double)count4 /n *100;
        double p5 = (double)count5 /n *100;

        System.out.printf("%.2f", p1);
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f", p2);
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f", p3);
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f", p4);
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f", p5);
        System.out.print("%");

    }
}
