package EXAM;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double kmFirstDay = Double.parseDouble(scanner.nextLine());

        double moreKmPerDay = 0;
        double totalKm = kmFirstDay;
        double KmPerDay = kmFirstDay;
        double percentage = 0;
        for (int i = 1; i <=n; i++) {
            percentage = Integer.parseInt(scanner.nextLine());
            moreKmPerDay = KmPerDay * (percentage/100);
            KmPerDay = KmPerDay + moreKmPerDay;
            totalKm = totalKm + KmPerDay;
        }

        if (totalKm >= 1000) {
            double difference = Math.ceil(totalKm - 1000);
            System.out.println("You've done a great job running " + (int)difference + " more kilometers!");
        } else {
            double difference = Math.ceil(1000 - totalKm);
            System.out.println("Sorry Mrs. Ivanova, you need to run "+ (int)difference +" more kilometers");
        }
    }
}
