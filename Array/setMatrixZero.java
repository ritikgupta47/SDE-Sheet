class setMatrixZero {
    public static void main(String[] args) {
        int[][] Matrix = { { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 } };

        setZeroes(Matrix);
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix.length; j++) {
                System.out.print(Matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {
        int row1 = 1;
        int col1 = 1;

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0)
                row1 = 0;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0)
                col1 = 0;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (row1 == 0) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
        if (col1 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}