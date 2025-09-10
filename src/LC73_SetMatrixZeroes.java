public class LC73_SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 0}
        };

        int rows = arr.length;
        int cols = arr[0].length;
        boolean firstRowZero = false;
        boolean firstColumnZero = false;

        for (int i = 0; i < rows; i++) {
            if(arr[i][0] == 0) {
                firstColumnZero = true;
                break;
            }
        }

        for (int i = 0; i < cols; i++) {
            if(arr[0][i] == 0){
                firstRowZero = true;
                break;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if(arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if(arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        if(firstColumnZero) {
            for (int i = 0; i < rows; i++) {
                arr[i][0] = 0;
            }
        }

        if(firstRowZero) {
            for (int i = 0; i < cols; i++) {
                arr[0][i] = 0;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
