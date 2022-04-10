package EXAM;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tshirtPrice = Double.parseDouble(scanner.nextLine());
        double goal = Double.parseDouble(scanner.nextLine());

        double shortsPrice = tshirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.20;
        double shoes = 2* (tshirtPrice + shortsPrice);
         double sumNoDiscount = tshirtPrice + shortsPrice + socksPrice + shoes;
         double sumDiscounted = sumNoDiscount - (sumNoDiscount * 0.15);


        if (sumDiscounted >= goal) {

            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", sumDiscounted);
        } else {
            double difference = Math.abs(goal - sumDiscounted);
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", difference);
        }


    }
}
