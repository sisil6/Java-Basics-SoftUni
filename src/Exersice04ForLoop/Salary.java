/*Шеф на компания забелязва че все повече служители прекарват  време в сайтове, които ги разсейват.
За да предотврати това, той въвежда изненадващи проверки на отворените табове на браузъра на служителите си.
Според отворения сайт в таба се налагат следните глоби:
"Facebook" -> 150 лв.
"Instagram" -> 100 лв.
"Reddit" -> 50 лв.
От конзолата се четат два реда:
Брой отворени табове в браузъра n - цяло число в интервала [1...10]
Заплата - число в интервала [500...1500]
След това n – на брой пъти се чете име на уебсайт – текст
Изход
Ако по време на проверката заплатата стане по-малка или равна на 0 лева, на конзолата се изписва
"You have lost your salary." и програмата приключва.
В противен случай след проверката на конзолата се изписва остатъкът от заплатата (да се изпише като цяло число).*/

package Exersice04ForLoop;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        String website = "";

        int tax = 0;
        int totalMoneyLeft = salary;


        for (int i = 1; i <= tabs; i++) {
            website = scanner.nextLine();
            if(website.equals("Facebook")){
                tax = 150;
            }
            else if(website.equals("Instagram")){
                tax = 100;
            }
            else if(website.equals("Reddit")){
                tax = 50;

            }
            else{
                tax = 0;
            }
            totalMoneyLeft = totalMoneyLeft - tax;

            if(totalMoneyLeft <= 0){
                break;
            }
        }
        if(totalMoneyLeft<=0){
            System.out.println("You have lost your salary.");
        }
        else{
            System.out.println(totalMoneyLeft);
        }


    }}
