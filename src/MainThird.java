import java.util.Scanner;

public class MainThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что ты хочешь");

        if (scanner.hasNextInt()) {
            System.out.println("тут работаем, как с числом");
        }
        else {
            System.out.println("тут работаем как со строкой");
        }

    }
}
