import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n1 = in.nextLong();
        long n2 = in.nextLong();

        while (n2 != 0) {
            long n3 = n1 ^ n2;

            n2 = (n1 & n2) << 1;

            n1 = n3;
        }

        System.out.println(n1);

        in.close();
    }
}
