/*Предприемчив българин отваря квартални магазинчета в няколко града и продава на различни цени:
град / продукт
           Sofia    Plovdiv   Varna
coffee     0.50     0.40      0.45
water      0.80     0.70      0.70
beer       1.20     1.15      1.10
sweets     1.45     1.30      1.35
peanuts    1.60     1.50      1.55

Напишете програма, която чете продукт (низ), град (низ) и количество (десетично число),
въведени от потребителя и пресмята и отпечатва колко струва съответното количество от избрания продукт в посочения град.
 */

package Lab03AdvancedConditStatements;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double productCount = Double.parseDouble(scanner.nextLine());

        if( city.equals("Sofia")){
            if(product.equals("coffee")){
                System.out.println(productCount * 0.50);
            }
            if(product.equals("water")){
                System.out.println(productCount * 0.80);
            }
            if(product.equals("beer")){
                System.out.println(productCount * 1.20);
            }
            if(product.equals("sweets")){
                System.out.println(productCount * 1.45);
            }
            if(product.equals("peanuts")){
                System.out.println(productCount * 1.60);
            }
        }
        if( city.equals("Plovdiv")){
            if(product.equals("coffee")){
                System.out.println(productCount * 0.40);
            }
            if(product.equals("water")){
                System.out.println(productCount * 0.70);
            }
            if(product.equals("beer")){
                System.out.println(productCount * 1.15);
            }
            if(product.equals("sweets")){
                System.out.println(productCount * 1.30);
            }
            if(product.equals("peanuts")){
                System.out.println(productCount * 1.50);
            }
        }
        if( city.equals("Varna")){
            if(product.equals("coffee")){
                System.out.println(productCount * 0.45);
            }
            if(product.equals("water")){
                System.out.println(productCount * 0.70);
            }
            if(product.equals("beer")){
                System.out.println(productCount * 1.10);
            }
            if(product.equals("sweets")){
                System.out.println(productCount * 1.35);
            }
            if(product.equals("peanuts")){
                System.out.println(productCount * 1.55);
            }
        }


    }
}
