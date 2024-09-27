import java.util.Scanner; // Для считывания информации от пользователя

public class Main 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
 
        // Запрашиваем у пользователя натуральное число
        System.out.print("Введите ваше умопомрочительное чиселко: ");
        int n = scanner.nextInt();

        // Проверяем, является ли введенное число натуральным
        if (n <= 0) {
            System.out.println("Пожалуйста, введите натуральное число.");
        } else {
            // Вызываем рекурсивный метод для печати Сиркузской последовательности
            int steps = collatzSequence(n, 0);
            System.out.println("Количество шагов до достижения единички: " + steps);
        }
        scanner.close();
    }

    public static int collatzSequence(int n, int steps) {
        // Печатаем текущее число
        System.out.print((steps == 0 ? "" : " -> ") + n);
        // Если n равно 1, возвращаем общее количество шагов
        if (n == 1) {
            return steps;
        }
        // Увеличиваем подсчет шагов
        steps++;
        // Проверяем, четное ли n, и рекурсивно вызываем метод с новым значением n
        if (n % 2 == 0) {
            return collatzSequence(n / 2, steps);  // Если n четное
        } else {
            return collatzSequence(3 * n + 1, steps);  // Если n нечетное
        }
    }
}