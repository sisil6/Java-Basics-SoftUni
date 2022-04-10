
//Да се напише програма, която чете от конзолата текст (име на човек) и отпечатва "Hello, <name>!", където <name> е въведеното име от конзолата.
package Lab01FirstSteps;

import java.util.Scanner;

public class GreetingByName {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            String greeting = "Hello, " + name + "!";
            System.out.println(greeting);
        }


}

