import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int n = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int m = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(m));
        }
        System.out.print("Вот случайный список:");
        for (Integer number : list) {
            System.out.print(" " + number);
        }
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список:");
        for (Integer number : result) {
            System.out.print(" " + number);
        }
        System.out.println();
        logger.log("Завершаем программу");
    }
}