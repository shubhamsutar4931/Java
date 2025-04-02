public class array_matrix {
    public static void main(String[] args) {
        int a[][] = { { 2, 3, 4 }, { 5, 8, 7 }, { 7, 6, 4 } };
        int b[][] = { { 1, 3, 5 }, { 5, 1, 6 }, { 2, 1, 4 } };
        int c[][] = new int[3][3];
        System.out.println("A matrix:");
        for (int i[] : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("B matrix:");
        for (int i[] : b) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("C matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // c[i][j] = a[i][j] + b[i][j];
                c[i][j] = a[i][j] * b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
