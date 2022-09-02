public class Task5 {
    private static void display(final int[][] arr) {
        for (final int[] rows : arr) {
            for (final int column : rows) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void create(final int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = (int) (Math.random() * 10);
    }

    public static void transpose(final int[][] baseArr,final int[][] resultArr) {
        for (int i = 0; i < baseArr.length; i++) {
            for (int j = 0; j < baseArr[i].length; j++) {
                resultArr[j][i] = baseArr[i][j];
            }
        }
    }

    public static void main(final String[] args) {
        final int row = 2;
        final int column = 3;
        final int[][] matrix = new int[row][column];

        create(matrix);
        System.out.println("Matrix:");
        display(matrix);

        System.out.println("Transposed matrix:");
        final int[][] transposed = new int[column][row];
        transpose(matrix, transposed);
        display(transposed);
    }
}
