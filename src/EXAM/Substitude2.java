package EXAM;

import java.util.Scanner;

public class Substitude2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        int validK = 0;
        int validL = 0;
        int validM = 0;
        int validN = 0;
        int printCount = 0;



            for (int i = k; i <= 8; i++) {
                if (i % 2 == 0) {
                    validK = i;
                    for (int j=9; j>=l; j--){
                        if (j % 2 != 0) {
                            validL = j;
                            for (int q=m;q<=8; q++){
                                if (q % 2 == 0) {
                                    validM = q;
                                    for (int w =9; w>=n; w--){
                                        if (w % 2 != 0) {
                                            validN = w;

                                            if(printCount== 6){
                                                break;
                                            }
                                            if (validK == validM && validL == validN) {
                                                System.out.println("Cannot change the same player.");
                                            }
                                            else {
                                                System.out.printf("%d%d - %d%d", validK, validL, validM, validN);

                                                printCount = printCount + 1;
                                                System.out.println();
                                            }

                                        }
                                    }
                                }
                            }
                        }

                }

                }


            }


        }
    }





