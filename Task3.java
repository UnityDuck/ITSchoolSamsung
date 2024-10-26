import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] array = new int[n];

        int counter = 0;

        boolean isDuplicate;

        for (int i = 0; i < n; i++) {
            int k = in.nextInt();
            isDuplicate = false;
            for (int el : array) {
                if (k == el) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                array[counter] = k;
                counter++;
            }
        }

        for (int i = 0; i < counter; i++) {
            System.out.print(array[i] + " ");
        }

        in.close();
    }
}
