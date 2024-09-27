import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод координат клада
        System.out.print("Введите координаты клада (x y): ");
        int treasureX = scanner.nextInt();
        int treasureY = scanner.nextInt();
        scanner.nextLine(); // Переход на следующую строку
        List<Directions> directionsList = new ArrayList<>();
        // Ввод указаний карты
        while (true) {
            System.out.print("Введите направление и количество шагов (или \"стоп\" для завершения): ");
            String direction = scanner.nextLine();
            if (direction.equalsIgnoreCase("стоп")) {
                break; // Завершение ввода
            }
            int steps = scanner.nextInt();
            scanner.nextLine(); // Переход на следующую строку
            // Добавление направления в список
            directionsList.add(new Directions(direction, steps));
        }
        // Поиск минимального количества указаний для достижения клада
        int minSteps = calculateMinSteps(directionsList, treasureX, treasureY);
        // Вывод результата
        System.out.println("Минимальное количество указаний для достижения клада, пират: " + minSteps);
    }

    public static int calculateMinSteps(List<Directions> directionsList, int targetX, int targetY) {
        int currentX = 0;
        int currentY = 0;
        int minSteps = 0;

        for (Directions dir : directionsList) {
            switch (dir.direction) {
                case "север":
                    currentY += dir.steps;
                    break;
                case "юг":
                    currentY -= dir.steps;
                    break;
                case "восток":
                    currentX += dir.steps;
                    break;
                case "запад":
                    currentX -= dir.steps;
                    break;
            }
            // Увеличиваем количество шагов
            minSteps++;
            // Проверяем, достигли ли мы клада
            if (currentX == targetX && currentY == targetY) {
                break; // Достигли клада
            }
        }
        return minSteps;
    }
}
// Класс для направления и количества шагов
class Directions {
    String direction;
    int steps;
    Directions(String direction, int steps) {
        this.direction = direction;
        this.steps = steps;
    }
}


