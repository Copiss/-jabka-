import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int[] findPair(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            // Рассчитываем необходимое значение для достижения целевой суммы
            int complement = target - num;

            // Проверяем, существует ли уже нужный элемент в мапе
            if (numMap.containsKey(complement)) {
                return new int[] {complement, num};  // Возвращаем пару
            }
            // Добавляем текущее число в мапу
            numMap.put(num, num);
        }
        return null;  // Если пара не найдена
    }

    public static void main(String[] args) 
    {
        int[] nums = {10, 15, 3, 7};
        int target = 25;

        int[] result = findPair(nums, target);
        if (result != null) 
        {
            System.out.println("Найдена пара с суммой " + target);
        } else 
        {
            System.out.println("null");
        }
    }
}