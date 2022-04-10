/*Да се напише програма, която чете име на продукт, въведено от потребителя и проверява дали е плод или зеленчук.
Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
Всички останали са "unknown"
Да се изведе "fruit", "vegetable" или "unknown" според въведения продукт. */
package Lab03AdvancedConditStatements;

import java.util.Scanner;

public class FruitVegetable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();

        switch (item) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "cucumber":
            case "tomato":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default: System.out.println("unknown");
                break;
        }
    }
}

