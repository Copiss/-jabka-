public class Main {

    public static int sumOf2DArray(int[][] array) 
    {
        int sum = 0; // Переменная для хранения суммы
        // Проходим по всем строкам двумерного массива
        for (int i = 0; i < array.length; i++) 
        {
            // Проверяем, что строка не нулевая
            if (array[i] != null) 
            {
                // Проходим по всем элементам текущей строки
                for (int j = 0; j < array[i].length; j++) 
                {
                    sum += array[i][j]; // Добавляем текущий элемент к сумме
                }
            }
        }
        return sum; // Возвращаем итоговую сумму
    }

    public static void main(String[] args) 
    {
        int[][] myArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int totalSum = sumOf2DArray(myArray);
        System.out.println("Сумма всех элементов в массиве: " + totalSum);
    }
}
