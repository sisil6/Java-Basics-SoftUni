/*Хотел предлага 2 вида стаи: студио и апартамент.
Напишете програма, която изчислява цената за целия престой за студио и апартамент.
Цените зависят от месеца на престоя:
Май и октомври
Юни и септември
Юли и август
Студио – 50 лв./нощувка
Студио – 75.20 лв./нощувка
Студио – 76 лв./нощувка
Апартамент – 65 лв./нощувка
Апартамент – 68.70 лв./нощувка
Апартамент – 77 лв./нощувка
Предлагат се и следните отстъпки:
За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
Вход
Входът се чете от конзолата и съдържа точно 2 реда, въведени от потребителя:
На първия ред е месецът – May, June, July, August, September или October
На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]
Изход
Да се отпечатат на конзолата 2 реда:
На първия ред: "Apartment: {цена за целият престой} lv."
На втория ред: "Studio: {цена за целият престой} lv."
Цената за целия престой форматирана с точност до два знака след десетичната запетая. */

package Exersice03AdvancedConditStatements;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;
        double studioDiscount  = 0;
        double apartmentDiscount = 0;

        switch (month){
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;
                if(7< nightsCount && nightsCount <= 14 ){
                    studioDiscount = 0.05;
                }
                else if(nightsCount > 14)
                {
                    studioDiscount = 0.30;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if(nightsCount > 14)
                {
                    studioDiscount = 0.20;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                break;
        }

        if (nightsCount > 14){
            apartmentDiscount = 0.10;
        }

        double studioTotal = (nightsCount * studioPrice);
        double studioTotalDiscounted = studioTotal - (studioTotal * studioDiscount);

        double apartTotal = nightsCount * apartmentPrice;
        double apartmentTotalDiscounted = apartTotal - (apartTotal * apartmentDiscount);


        System.out.printf("Apartment: %.2f lv.", apartmentTotalDiscounted);
        System.out.println();
        System.out.printf("Studio: %.2f lv.",studioTotalDiscounted);

    }
}
