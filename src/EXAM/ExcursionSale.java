package EXAM;

import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seaCount = Integer.parseInt(scanner.nextLine());
        int mountainCount = Integer.parseInt(scanner.nextLine());

        int seePrice = 680;
        int mountainPrice = 499;
        int totalSeaPrice = 0;
        int totalMountainPrice = 0;

        while (seaCount > 0 || mountainCount > 0) {
            String pack = scanner.nextLine();
            if (pack.equals("Stop")) {
                break;
            } else {
                if (pack.equals("sea")) {
                    if (seaCount !=0) {
                        seaCount = seaCount - 1;
                        totalSeaPrice = totalSeaPrice + seePrice;
                    }

                }
                if (pack.equals("mountain")) {
                    if (mountainCount !=0) {
                        mountainCount = mountainCount - 1;
                        totalMountainPrice = totalMountainPrice + mountainPrice;
                    }

                }
            }
        }

        int total = totalMountainPrice + totalSeaPrice;

        if(seaCount == 0 && mountainCount ==0){
            System.out.println("Good job! Everything is sold.");
            System.out.printf("Profit: %d leva.", total);
        }
        if(seaCount > 0 || mountainCount > 0){
            System.out.printf("Profit: %d leva.", total);
        }


    }
}

