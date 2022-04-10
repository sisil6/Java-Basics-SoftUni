//Напишете програма, която прочита от конзолата име, фамилия, възраст и град и печата следното съобщение: "You are <firstName> <lastName>, a <age>-years old person from <town>."

package Lab01FirstSteps;
import java.util.Scanner;

public class ConcatenateData {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String town = scanner.nextLine();
            String text = "You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + town + ".";
            System.out.println(text);
        }
    }
/*
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first name");
        String firstName = scanner.nextLine();
        System.out.println("Input last name");
        String lastName = scanner.nextLine();
        System.out.println("Input age name");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input town");
        String town = scanner.nextLine();
        String text = "You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + town + ".";
        System.out.println(text);
    }
}
*/


