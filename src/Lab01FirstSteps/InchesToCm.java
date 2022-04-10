//Да се напише програма, която чете от конзолата реално число и го преобразува от инчове в сантиметри. За целта умножете инчовете по 2.54 (1 инч = 2.54 сантиметра).

package Lab01FirstSteps;

import java.util.Scanner;

public class InchesToCm {
          public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            double a = Double.parseDouble(scanner.nextLine());
            var area = a * 2.54;
            System.out.println(area);
        }
    }


