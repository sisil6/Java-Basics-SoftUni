/* Поканени сте от академията да напишете софтуер, който да пресмята точките за актьор/актриса.
Академията ще ви даде първоначални точки за актьора. След това всеки оценяващ ще дава своята оценка.
Точките, които актьора получава се формират от: дължината на името на оценяващия умножено по точките, които дава делено на две.
Ако резултатът в някой момент надхвърли 1250.5 програмата трябва да прекъсне и да се отпечата, че дадения актьор е получил номинация.
Вход
Име на актьора - текст
Точки от академията - реално число в интервала [2.0... 450.5]
Брой оценяващи n - цяло число в интервала[1… 20]
На следващите n-на брой реда:
Име на оценяващия - текст
Точки от оценяващия - реално число в интервала [1.0... 50.0]
Изход
Да се отпечата на конзолата един ред:
Ако точките са над 1250.5:
"Congratulations, {име на актьора} got a nominee for leading role with {точки}!"
Ако точките не са достатъчни:
	"Sorry, {име на актьора} you need {нужни точки} more!"
Резултатът да се форматирана до първата цифра след десетичния знак! */

package Exersice04ForLoop;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double startPoints = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());
        String juryName = "";
        double juryPoints = 0;
        int juryNameLong = 0;


        double points = 0;
        double totalPoints = startPoints;


        for (int i = 1; i <= juryCount; i++) {
            juryName = scanner.nextLine();
            juryPoints = Double.parseDouble(scanner.nextLine());
            juryNameLong = juryName.length();
            points = ((juryNameLong * juryPoints)/2);
            totalPoints = totalPoints + points;
            if(totalPoints > 1250.5){
                break;
            }
        }

        totalPoints = Math.abs(totalPoints);
        if(totalPoints > 1250.5){
            System.out.printf("Congratulations, " + actorName + " got a nominee for leading role with %.1f!", totalPoints);
        }
        else{
            double difference = Math.abs(1250.5 - totalPoints);
            System.out.printf("Sorry, " + actorName + " you need %.1f more!", difference);
        }

        }
    }

