/*Да се напише програма, която чете текст (стринг), въведен от потребителя,
изчислява и отпечатва сумата от стойностите на гласните букви според таблицата по-долу:
буква
a - 1
e - 2
i - 3
o - 4
u - 5
*/

package Lab04ForLoop;

import java.util.Scanner;

public class SumLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int num = 0;

        for(int i= 0; i< text.length(); i++){
            char symbol = text.charAt(i);
            switch (symbol){
                case 'a':
                    num = num + 1; break;
                case 'e':
                    num = num + 2; break;
                case 'i':
                    num = num + 3; break;
                case 'o':
                    num = num+ 4; break;
                case 'u': num = num + 5; break;
            }

        }
        System.out.println(num);

    }
}
