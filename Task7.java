import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] matrix = new int[n][];

        for (int i = 0; i < n; i++) {
            matrix[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                matrix[i][j] += Math.max(matrix[i + 1][j], matrix[i + 1][j + 1]);
            }
        }

        System.out.println(matrix[0][0]);

        in.close();
    }
}


