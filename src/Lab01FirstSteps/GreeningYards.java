/*Божидара разполага с няколко къщи на Черноморието и желае да озелени дворовете на някои от тях, като по този начин създаде уютна обстановка и комфорт на гостите си. За целта е наела фирма.
Напишете програма, която изчислява необходимате сума, които Божидара ще трябва да заплати на фирмата изпълнител на проекта. Цената на един кв. м. е 7.61 лв със ДДС. Понеже нейният двор е доста голям, фирмата изпълнител предлага 18% отстъпка от крайната цена.
Вход
От конзолата се прочита само един ред:
Кв. метри, които ще бъдат озеленени – реално число в интервала [0.00 … 10000.00]
Изход
На конзолата се отпечатват два реда:
"The final price is: {крайна цена на услугата} lv."
"The discount is: {отстъпка} lv."*/


package Lab01FirstSteps;
import java.util.Scanner;
import java.text.DecimalFormat;

public class GreeningYards {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());
        double pricePerScm = 7.61;
        double totalPrice = squareMeters * pricePerScm;
        double discountPerScm = 0.18;
        double totalDiscount = totalPrice * discountPerScm;
        double totalDiscountedPrice = totalPrice - totalDiscount;
        System.out.println("The discount is: " + df.format(totalDiscountedPrice) + " lv.");
        System.out.println("The final price is: " + df.format(totalDiscount) + " lv.");
    }
}

