import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное трехзначное число: ");
        // Проверяем, является ли введенное значение целым числом
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            // Проверяем, является ли число трехзначным
            if (isThreeDigit(number)) {
                // Проверяем, является ли число "дважды чётным"
                if (isDoubleEven(number)) {
                    System.out.println("Число " + number + " является 'дважды чётным'.");
                } else {
                    System.out.println("Число " + number + " не является 'дважды чётным'.");
                }
            } else {
                System.out.println("Ошибка: Введите трехзначное число.");
            }
        } else {
            System.out.println("Ошибка: Введите целое число.");
        }
        scanner.close();
    }
    // Метод для проверки, является ли число трехзначным
    public static boolean isThreeDigit(int number) {
        return number >= 100 && number <= 999;
    }
    // Метод для проверки, является ли число "дважды чётным"
    public static boolean isDoubleEven(int number) {
        int sum = 0;      // Сумма цифр числа
        int product = 1;  // Произведение цифр числа       
        // Извлекаем цифры числа и вычисляем сумму и произведение
        while (number > 0) {
            int digit = number % 10; // Получаем последнюю цифру
            sum += digit;            // Считаем сумму
            product *= digit;        // Считаем произведение
            number /= 10;            // Убираем последнюю цифру
        }
        // Проверяем, чётны ли сумма и произведение
        return (isEven(sum) && isEven(product));
    }
    // Проверяем чётность числа
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
