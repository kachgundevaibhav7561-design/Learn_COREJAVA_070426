public class multidimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 30 },
                { 11, 22, 33 }
        };

        for (int i = 0; i <= matrix.length; i++) {
            for (int j = 0; j <= matrix.length; j++) {
                System.err.print(matrix[i][j] + "  ");

            }
            System.out.println();
        }

        // enhance for
        /*
         * for(int [] row : matrix){
         * for(int value : row){
         * system.out.println(value+" ")
         * }
         * system.ouy.println();
         * }
         */

    }
}
