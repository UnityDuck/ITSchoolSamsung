import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();

        while (n > 0) {
            System.out.print(n % 10);
            n /= 10;
        }

        in.close();
    }
}