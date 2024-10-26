import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int counter = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                counter += 1;
            }

            else {
                System.out.print(str.charAt(i));
                System.out.print(counter);

                counter = 1;
            }
        }

        System.out.print(str.charAt(str.length() - 1));
        System.out.print(counter);

        in.close();
    }
}
