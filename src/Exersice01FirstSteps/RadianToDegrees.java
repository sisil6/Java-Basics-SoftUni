/*Напишете програма, която чете ъгъл в радиани (десетично число) и го преобразува в градуси. Използвайте формулата: градус = радиан * 180 / π. Числото π в Java програми е достъпно чрез Math.PI.*/
package Exersice01FirstSteps;
import java.util.Scanner;
public class RadianToDegrees
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);
    }
}

