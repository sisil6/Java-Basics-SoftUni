/* Фирма дава следните комисионни на търговците си според града, в който работят и обема на продажбите s:
Град                    Sofia       Varna       Plovdiv
0 ≤ s ≤ 500             5%          4.5%        5.5%
500 < s ≤ 1 000         7%          7.5%        8%
1 000 < s ≤ 10 000      8%          10%         12%
s > 10 000              12%         13%         14.5%

Напишете конзолна програма, която чете име на град (текст) и обем на продажби (реално число) ,
 въведени от потребителя, и изчислява и извежда размера на търговската комисионна според горната таблица.
 Резултатът да се изведе форматиран до 2 цифри след десетичната точка.
 При невалиден град или обем на продажбите (отрицателно число) да се отпечата "error".
 */

package Lab03AdvancedConditStatements;

import java.util.Scanner;

public class TradeCommisions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double income = Double.parseDouble(scanner.nextLine());

        double commission = 0;

        if (0 <= income && income <= 500) {
            switch (city) {
                case "Sofia":
                    commission = 0.05;
                    break;
                case "Varna":
                    commission = 0.045;
                    break;
                case "Plovdiv":
                    commission = 0.055;
                    break;
                default: commission = 0;
            }
        }
            else if(500 < income && income <= 1000){
            switch (city) {
                case "Sofia":
                    commission = 0.07;
                    break;
                case "Varna":
                    commission = 0.075;
                    break;
                case "Plovdiv":
                    commission = 0.08;
                    break;
                default: commission = 0;
            }
            }
        else if(1000 < income && income <= 10000){
            switch (city) {
                case "Sofia":
                    commission = 0.08;
                    break;
                case "Varna":
                    commission = 0.10;
                    break;
                case "Plovdiv":
                    commission = 0.12;
                    break;
                default: commission = 0;
            }
        }
        else if(10000 < income){
            switch (city) {
                case "Sofia":
                    commission = 0.12;
                    break;
                case "Varna":
                    commission = 0.13;
                    break;
                case "Plovdiv":
                    commission = 0.145;
                    break;
                default: commission = 0;
            }
        }

        if( commission == 0){
            System.out.println("error");
        }


        else{
            double total = commission * income;
            System.out.printf("%.2f", total);
        }

        }
    }

