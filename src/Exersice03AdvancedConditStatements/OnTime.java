/*Студент трябва да отиде на изпит в определен час. Той идва в изпитната зала в даден час на пристигане.
Счита се, че студентът е дошъл навреме, ако е пристигнал в часа на изпита или до половин час преди това.
Ако е пристигнал по-рано повече от 30 минути, той е подранил. Ако е дошъл след часа на изпита, той е закъснял.
Напишете програма, която прочита време на изпит и време на пристигане и отпечатва дали студентът е дошъл навреме,
дали е подранил или е закъснял и с колко часа или минути е подранил или закъснял.
Вход
От конзолата се четат 4 цели числа (по едно на ред), въведени от потребителя:
Първият ред съдържа час на изпита – цяло число от 0 до 23.
Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
Третият ред съдържа час на пристигане – цяло число от 0 до 23.
Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.
Изход
На първият ред отпечатайте:
"Late", ако студентът пристига по-късно от часа на изпита.
"On time", ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
"Early", ако студентът пристига повече от 30 минути преди часа на изпита.
Ако студентът пристига с поне минута разлика от часа на изпита, отпечатайте на следващия ред:
"mm minutes before the start" за идване по-рано с по-малко от час.
"hh:mm hours before the start" за подраняване с 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:05.
 "mm minutes after the start" за закъснение под час.
"hh:mm hours after the start" за закъснение от 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:03. */

package Exersice03AdvancedConditStatements;

import java.util.Scanner;

public class OnTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examFullMinutes = examHour * 60 + examMinutes;
        int arrivalFullMinutes = arrivalHour * 60 + arrivalMinutes;

        int diffHour = 0;
        int diffMin = 0;


        //late:
        if(examFullMinutes < arrivalFullMinutes) {
            int difference = Math.abs(arrivalFullMinutes - examFullMinutes);
            System.out.println("Late");
            if (difference < 60){
                System.out.printf("%d minutes after the start", difference);
            } else {
                diffHour = (int) difference / 60;
                diffMin = (int) difference % 60;

                if (diffMin >= 10) {
                    System.out.printf("%d:%d hours after the start", diffHour, diffMin);
                } else if (diffMin < 10) {
                    System.out.printf("%d:0%d hours after the start", diffHour, diffMin);
                }

            }
        }
            //on time and early:
            else{
            int difference = Math.abs(examFullMinutes - arrivalFullMinutes);
                  if (difference <= 30 && difference >=0)
            {
                System.out.println("On time");
                    System.out.printf("%d minutes before the start", difference);
                }
                 else{
            System.out.println("Early");
            if (difference < 60){
                System.out.printf("%d minutes before the start", difference);
            }
                 else {
                diffHour = (int) difference / 60;
                diffMin = (int) difference % 60;

                if (diffMin >= 10) {
                    System.out.printf("%d:%d hours before the start", diffHour, diffMin);
                } else if (diffMin < 10) {
                    System.out.printf("%d:0%d hours before the start", diffHour, diffMin);
                }
            }
            }


            }

        }



    }

