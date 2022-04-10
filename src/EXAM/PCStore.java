package EXAM;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceProcessor = Double.parseDouble(scanner.nextLine());
        double priceCard = Double.parseDouble(scanner.nextLine());
        double priceRam = Double.parseDouble(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double priceProcessorLv = priceProcessor * 1.57;
        double priceCardLv = priceCard * 1.57;
        double priceRamLv = priceRam * 1.57;
        double ramTotal = ramCount * priceRamLv;
        double processorDiscounted = priceProcessorLv - (priceProcessorLv * discount);
        double cardDiscounted = priceCardLv - (priceCardLv * discount);
        double total = ramTotal + processorDiscounted + cardDiscounted;
        System.out.printf("Money needed - %.2f leva.", total);

    }
}
