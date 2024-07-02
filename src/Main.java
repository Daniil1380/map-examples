import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    //Пользователь вводит название города, мы возвращаем, сколько километров ехать до этого города
    //Если такого города нет в мапе, то справшиваем у пользователя, сколько до этого города ехать
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> cityDistanceMap = new HashMap<>();

        while (true) {
            String cityName = scanner.nextLine();
            if (cityDistanceMap.containsKey(cityName)) {
                int kilometres = cityDistanceMap.get(cityName);
                System.out.println(kilometres);
            }
            else {
                System.out.println("Информация по городу отсутствует, введите ваше значение для этого города:");
                String line = scanner.nextLine();
                int kilometres = Integer.parseInt(line);
                cityDistanceMap.put(cityName, kilometres);
            }


        }

    }
}
