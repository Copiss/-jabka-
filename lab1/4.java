import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Введите количество дорог: ");
        int numberOfRoads = scanner.nextInt();
        int maxHeight = 0; // Максимальная высота, которую может преодолеть грузовик
        int bestRoad = -1; // Номер дороги с максимальной высотой, подходящей для грузовика
        for (int i = 1; i <= numberOfRoads; i++) {
            System.out.print("Введите количество туннелей для дороги " + i + ": ");
            int numberOfTunnels = scanner.nextInt();
            // Используем список для хранения высот туннелей
            List<Integer> tunnelHeights = new ArrayList<>();
            for (int j = 0; j < numberOfTunnels; j++) {
                System.out.print("Введите высоту туннеля " + (j + 1) + ": ");
                int tunnelHeight = scanner.nextInt();
                tunnelHeights.add(tunnelHeight); // Добавляем высоту туннеля в список
            }
            // Вычисляем минимальную высоту туннелей на данной дороге
            int minHeightForRoad = findMinHeight(tunnelHeights);            
            // Сравниваем минимальную высоту данной дороги с текущей максимальной
            if (minHeightForRoad > maxHeight) {
                maxHeight = minHeightForRoad; // Обновляем максимальную высоту
                bestRoad = i; // Запоминаем номер дороги с данной высотой
            }
        }       
        // Выводим номер дороги и максимальную высоту
        System.out.println("Лучшая дорога: " + bestRoad + ", максимальная высота: " + maxHeight);        
        scanner.close();
    }
    // Метод для нахождения минимальной высоты из списка
    private static int findMinHeight(List<Integer> tunnelHeights) {
        int minHeight = Integer.MAX_VALUE; // Инициализируем минимальную высоту
        for (int height : tunnelHeights) {
            // Сравниваем текущую высоту с минимальной
            if (height < minHeight) {
                minHeight = height; // Обновляем минимальную высоту
            }
        }
        return minHeight; // Возвращаем минимальную высоту
    }
}
