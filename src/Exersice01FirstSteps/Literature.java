/*За лятната ваканция в списъка със задължителна литература на Жоро има определен брой книги. Понеже Жоро предпочита да играе с приятели навън, вашата задача е да му помогнете да изчисли колко часа на ден трябва да отделя, за да прочете необходимата литература.
Вход
От конзолата се четат 3 реда:
1.	Брой страници в текущата книга – цяло число в интервала [1…1000]
2.	Страници, които прочита за 1 час – цяло число в интервала [1…1000]
3.	Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]
Изход
Да се отпечата на конзолата броят часове, които Жоро трябва да отделя за четене всеки ден.
*/

package Exersice01FirstSteps;


import java.util.Scanner;

public class Literature {
  public static void main (String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int pagesInCurrentBook = Integer.parseInt(scanner.nextLine());
            int pagesPerHour = Integer.parseInt(scanner.nextLine());
            int daysToRead = Integer.parseInt(scanner.nextLine());
            int totalReadingTime = pagesInCurrentBook / pagesPerHour;
            int totalHoursPerDay = totalReadingTime / daysToRead;
            System.out.println(totalHoursPerDay);
                  }
    }