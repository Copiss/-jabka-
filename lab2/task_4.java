public class Main {
    
    public static int[][] rotate90Clockwise(int[][] matrix) 
    {
        if (matrix == null || matrix.length == 0) // Для нулевых массивов
        {
            return new int[0][0];
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotated = new int[cols][rows];

        for (int i = 0; i < rows; i++) // Меняем элементы местами
        {
            for (int j = 0; j < cols; j++) 
            {
                rotated[j][rows - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }

    public static void printMatrix(int[][] matrix) // Вывод матрицы
    {
        for (int[] row : matrix) 
        {
            for (int element : row) 
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Исходный массив:");
        printMatrix(matrix);

        int[][] rotatedMatrix = rotate90Clockwise(matrix);

        System.out.println("Массив, повёрнутый на 90 градусов по часовой стрелке: ");
        printMatrix(rotatedMatrix);
    }
}
