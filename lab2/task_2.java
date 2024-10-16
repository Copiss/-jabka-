import java.util.Arrays;

public class Main 
{
    public static int[] merge(int[] array1, int[] array2) 
    {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];

        int i = 0, j = 0, k = 0;

        // Слияние массивов
        while (i < length1 && j < length2) 
        {
            if (array1[i] <= array2[j]) 
            {
                mergedArray[k++] = array1[i++];
            } else 
            {
                mergedArray[k++] = array2[j++];
            }
        }

        // Добавляем оставшиеся элементы из первого массива
        while (i < length1) 
        {
            mergedArray[k++] = array1[i++];
        }

        // Добавляем оставшиеся элементы из второго массива
        while (j < length2) 
        {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) 
    { // Вводим массивы
        int[] array1 = {35, 46, 51, 86};
        int[] array2 = {25, 43, 65, 84};

        int[] merged = merge(array1, array2);

        System.out.println("Объединенный отсортированный массив: " + Arrays.toString(merged));
    }
}
