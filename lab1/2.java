import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите натуральное положительное число n, пожалуйста: ");
        int n = scanner.nextInt(); // Читаем количество чисел
        
        // Создаем массив для хранения n чисел
        int[] numbers = new int[n];
        
        // Читаем n чисел и сохраняем их в массив
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Читаем каждое число и сохраняем в массив
        }
        int sum = 0; // Переменная для хранения итоговой суммы
        // Вычисляем знакочередующуюся сумму
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += numbers[i]; // Добавляем, если индекс четный (0, 2, 4...)
            } else {
                sum -= numbers[i]; // Вычитаем, если индекс нечетный (1, 3, 5...)
            }
        }
        // Выводим наш результат
        System.out.println("Ваша знакочередующаяся сумма (всегда пожалуйста): " + sum);
        scanner.close();
    }
}
