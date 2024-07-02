import java.util.*;

public class MainSecond {

    public static void main(String[] args) {

        //Необходимо создать журнал преподавателя
        //Препод вводит фамилию ученика и оценку, которую этот ученик получил
        //Вывести на экран - все оценки ученика
        //+ средний бал ученика (*)


        Map<String, List<Integer>> people = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String secondName = scanner.nextLine();
            if (people.containsKey(secondName)) {
                List<Integer> list = people.get(secondName);
                System.out.println("Введите оценку ученика: ");
                String line = scanner.nextLine();
                int mark = Integer.parseInt(line);
                list.add(mark);
                System.out.println("Список всех оценок: " + list);
            } else {
                System.out.println("Ученика нет, но мы его создали для вас!");
                List<Integer> list = new ArrayList<>();
                people.put(secondName, list);
            }
        }
    }
}
