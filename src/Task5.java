public class Task5 {
    private static void display(final int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void create(final int[][] arr, final int row, final int column) {
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                arr[i][j] = (int) (Math.random() * 10);
    }

    public static void transpose(final int[][] baseArr, final int row, final int column, final int[][] resultArr) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                resultArr[j][i] = baseArr[i][j];
            }
        }
    }

    public static void main(final String[] args) {
        final int row = 2;
        final int column = 3;
        final int[][] matrix = new int[row][column];

        create(matrix, row, column);
        System.out.println("Matrix:");
        display(matrix);

        System.out.println("Transposed matrix:");
        final int[][] transposed = new int[column][row];
        transpose(matrix, row, column, transposed);
        display(transposed);
    }
}
