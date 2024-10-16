public class Main 
{
    public static int maxSubarraySum(int[] arr) 
    {
        // Проверяем пустой массив
        if (arr == null || arr.length == 0) 
        {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        // Инициализация переменных
        int maxCurrent = arr[0]; // Текущая максимальная сумма
        int maxGlobal = arr[0];  // Глобальная максимальная сумма
        
        // Проходим через массив, начиная со второго элемента
        for (int i = 1; i < arr.length; i++) 
        {
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]); // Обновляем текущую сумму
            if (maxCurrent > maxGlobal) 
            {
                maxGlobal = maxCurrent; // Обновляем глобальную максимальную сумму
            }
        }
        return maxGlobal; // Возвращаем максимальную сумму подмассива

    public static void main(String[] args) 
    {
        int[] array = { -2, 1, -3, -4, -1, -2, 1, 1, 1, -5 };
        int maxSum = maxSubarraySum(array);
        System.out.println("Максимальная сумма подмассива: " + maxSum);
    }
}
