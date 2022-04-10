/*Напишете програма, която пресмята нужните разходи за закупуването на храна за кучета и котки.  Храната се пазарува от зоомагазин, като една опаковка храна за кучета е на цена 2.50 лв, а опаковка храна за котки струва 4 лв.
Вход
От конзолата се четат 2 реда:
Броят на опаковките храна за кучета – цяло число в интервала [0… 100]
Броят на опаковките храна за котки –  цяло число в интервала [0… 100]
Изход
На конзолата се отпечатва:
"{крайната сума} lv."*/

package Lab01FirstSteps;
import java.util.Scanner;
public class ZooShop {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int dogFoodCount = Integer.parseInt(scanner.nextLine());
            int catFoodCount = Integer.parseInt(scanner.nextLine());
           double dogFoodSinglePrice = 2.50;
           int catFoodSinglePrice = 4;
           double dogFoodTotal = dogFoodCount * dogFoodSinglePrice;
           int catFoodTotal = catFoodCount * catFoodSinglePrice;
           double totalFoodCost = dogFoodTotal + catFoodTotal;
            String text = totalFoodCost + " lv.";
            System.out.println(text);
        }
    }