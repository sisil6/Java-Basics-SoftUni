/*Напишете програма, която чете от конзолата плод (banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
ден от седмицата (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday)
и количество (десетично число) , въведени от потребителя, и пресмята цената според цените от таблиците по-горе.
При невалиден ден от седмицата или невалидно име на плод да се отпечата "error".
 */

package Lab03AdvancedConditStatements;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        String day = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        double price = 0;
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Thursday":
            case "Wednesday":
            case "Friday":
                switch (item) {
                    case "banana":
                        price = 2.50;
                        break;
                    case "apple":
                        price = 1.20;
                        break;
                    case "orange":
                        price = 0.85;
                        break;
                    case "grapefruit":
                        price = 1.45;
                        break;
                    case "kiwi":
                        price = 2.70;
                        break;
                    case "pineapple":
                        price = 5.50;
                        break;
                    case "grapes":
                        price = 3.85;
                        break;
                    default:
                        price = 0;
                }
            }

            switch (day){
            case "Saturday":
            case "Sunday": {
                switch (item) {
                    case "banana":
                        price = 2.70;
                        break;
                    case "apple":
                        price = 1.25;
                        break;
                    case "orange":
                        price = 0.90;
                        break;
                    case "grapefruit":
                        price = 1.60;
                        break;
                    case "kiwi":
                        price = 3.00;
                        break;
                    case "pineapple":
                        price = 5.60;
                        break;
                    case "grapes":
                        price = 4.20;
                        break;
                    default:
                        price = 0;
                }
            }
        }
        if( price == 0){
            System.out.println("error");
        }
        else{
            double total = price * count;
            System.out.printf("%.2f", total);
        }
    }
}

