import java.util.HashSet;
import java.util.Scanner;

public class Main {
    
    public static String findLongestUniqueSubstring(String input) 
    {
        int n = input.length();
        int start = 0, end = 0, maxLength = 0;
        int maxStart = 0; // Начало самой длинной уникальной подстроки
        HashSet<Character> charSet = new HashSet<>();

        while (end < n) 
        {
            if (!charSet.contains(input.charAt(end))) 
            {
                charSet.add(input.charAt(end));
                end++;
                // Обновляем максимальную длину и начало уникальной подстроки
                if (end - start > maxLength) 
                {
                    maxLength = end - start;
                    maxStart = start;
                }
            } else {
                charSet.remove(input.charAt(start));
                start++;
            }
        }
        // Возвращаем наибольшую уникальную подстроку
        return input.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String longestUniqueSubstring = findLongestUniqueSubstring(input);
        System.out.println("Наибольшая подстрока без повторяющихся символов: " + longestUniqueSubstring);
        scanner.close();
    }
}
