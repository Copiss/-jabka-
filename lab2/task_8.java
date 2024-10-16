public class Main 
{ Аналогично пункту 4
    public static int[][] rotateCounterClockwise(int[][] matrix) 
    {
        if (matrix == null  matrix.length == 0) 
        {
            return new int[0][0];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotatedMatrix = new int[cols][rows];

        for (int i = 0; i  rows; i++) 
        {
            for (int j = 0; j  cols; j++) 
            {
                rotatedMatrix[cols - j - 1][i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }

    public static void printMatrix(int[][] matrix) 
    {
        for (int[] row  matrix) 
        {
            for (int value  row) 
            {
                System.out.print(value +  );
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

        System.out.println(Изначальный массив);
        printMatrix(matrix);
        int[][] rotated = rotateCounterClockwise(matrix);
        System.out.println(Повёрнутый на 90 градусов против часовой стрелки массив);
        printMatrix(rotated);
    }
}