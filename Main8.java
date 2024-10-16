import java.util.Scanner;

public class Main8 {
    public static void hanoi(int n, char s, char d, char a) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + s + " to " + d);
            return;
        }

        hanoi(n - 1, s, a, d);

        System.out.println("Move disk " + n + " from " + s + " to " + d);

        hanoi(n - 1, a, d, s);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        hanoi(n, 'A', 'C', 'B');

        in.close();
    }
}
