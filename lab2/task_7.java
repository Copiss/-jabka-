public class Main {

    public static int[] findMaxInRows(int[][] array) 
    {
        // Проверяем, что массив не пустой
        if (array == null || array.length == 0) 
        {
            return new int[0]; 
        }
        // Создаем одномерный массив для хранения максимальных значений
        int[] maxInRows = new int[array.length];
        // Проходим по каждой строке двумерного массива
        for (int i = 0; i < array.length; i++) 
        {
            // Инициализируем максимальное значение первым элементом строки
            int max = array[i][0];
            // Проходим по всем элементам строки
            for (int j = 1; j < array[i].length; j++) 
            {
                // Сравниваем и обновляем максимальное значение
                if (array[i][j] > max) 
                {
                    max = array[i][j];
                }
            }
            // Сохраняем максимальное значение в одномерный массив
            maxInRows[i] = max;
        }
        return maxInRows; // Возвращаем массив с максимальными элементами
    }
    public static void main(String[] args) 
    {
        int[][] array = {
            {3, 5, 1},
            {9, 2, 8},
            {4, 7, 6}
        };
        int[] maxValues = findMaxInRows(array);
        // Выводим максимальные значения
        for (int value : maxValues) {
            System.out.print(value + " "); 
        }
    }
}
