package EXAM;

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double pricePerPerson = 0;

        if (people <= 5){
            switch (season){
                case "spring": pricePerPerson = 50; break;
                case "summer": pricePerPerson = 48.50; break;
                case "autumn": pricePerPerson = 60; break;
                case "winter": pricePerPerson = 86; break;
            }
        }
        else{
            switch (season){
                case "spring": pricePerPerson = 48; break;
                case "summer": pricePerPerson = 45; break;
                case "autumn": pricePerPerson = 49.50; break;
                case "winter": pricePerPerson = 85; break;
            }
        }

       double sumNoDiscount = people * pricePerPerson;
         if(season.equals("summer")){
             double summerDiscounted = sumNoDiscount - (sumNoDiscount * 0.15);
             System.out.printf("%.2f leva.", summerDiscounted);
         }
         else if(season.equals("winter")){
             double overpay = sumNoDiscount + (sumNoDiscount * 0.08);
             System.out.printf("%.2f leva.", overpay);
         }
         else{
             System.out.printf("%.2f leva.", sumNoDiscount);
         }


    }
}
