import java.util.Scanner;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine().toLowerCase().replaceAll("\\s+", "");
        String str2 = in.nextLine().toLowerCase().replaceAll("\\s+", "");

        if (str1.length() != str2.length()) {
            System.out.println("No");
            return;
        }

        char[] str1_arr = str1.toCharArray();
        char[] str2_arr = str2.toCharArray();

        Arrays.sort(str1_arr);
        Arrays.sort(str2_arr);

        if (Arrays.equals(str1_arr, str2_arr)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        in.close();
    }
}
