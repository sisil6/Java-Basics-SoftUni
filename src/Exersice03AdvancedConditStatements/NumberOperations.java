/*Напишете програма, която чете две цели числа (N1 и N2) и оператор, с който да се извърши дадена математическа операция с тях.
Възможните операции са: Събиране (+), Изваждане (-), Умножение (*), Деление (/) и Деление с остатък (%).
При събиране, изваждане и умножение на конзолата трябва да се отпечата резултатът и дали той е четен или нечетен.
При обикновеното деление – резултатът. При модулното деление – остатъка.
Трябва да се има предвид, че делителят може да е равен на 0(нула), а на нула не се дели.
В този случай трябва да се отпечата специално съобщениe.
Вход
От конзолата се прочитат 3 реда, въведени от потребителя:
N1 – цяло число в интервала [0...40 000]
N2 – цяло число в интервала [0...40 000]
Оператор – един символ измеду: "+", "-", "*", "/", "%"
Изход
Да се отпечата на конзолата един ред:
Ако операцията е събиране, изваждане или умножение:
 "{N1} {оператор} {N2} = {резултат} – {even/odd}"
Ако операцията е деление:
"{N1} / {N2} = {резултат}" – резултатът е форматиран до вторият знак след дес.запетая
Ако операцията е деление с остатък:
"{N1} % {N2} = {остатък}"
В случай на деление с 0 (нула):
"Cannot divide {N1} by zero"*/


package Exersice03AdvancedConditStatements;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        if(b == 0)
        {
            System.out.printf("Cannot divide %d by zero", a);
        }
        else {
            double result = 0;
            String evenOdd = "";

            switch (operator) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = (double) a / (double) b; break;
                case "%":
                    result= a % b; break;
            }

             switch (operator) {
                        case "+":
                        case "-":
                        case "*":
                            if (result % 2 == 0) {
                                evenOdd = "even";
                            } else {
                                evenOdd = "odd";
                            }
                            System.out.printf(a + " " + operator + " " + b + " = " + (int)result + " - " + evenOdd);
                            break;
                 case "/":
                     System.out.printf(a + " " + operator + " " + b + " = " + "%.2f",result ); break;

                 case "%":
                     System.out.println(a + " " + operator + " " + b + " = " + (int)result ); break;
                    }

        }



            }

        }



