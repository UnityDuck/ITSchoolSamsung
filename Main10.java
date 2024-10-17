import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();

        int[] index_arr = kmpLooker(str1, str2);

        if (index_arr[0] == -1) {
            System.out.println(-1);
        }
        else {
            for (int i = 0; i < index_arr[0]; i++) {
                System.out.print(index_arr[i + 1] + " ");
            }
        }

        in.close();
    }

    public static int[] kmpLooker(String str1, String str2) {
        int[] prefix_func = lookCompute(str2);

        int n = str1.length();
        int m = str2.length();

        int[] index_arr = new int[n + 1];

        index_arr[0] = 0;

        int counter = 0;
        int i = 0;
        int j = 0;

        while (i < n) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                index_arr[++counter] = i - j;

                j = prefix_func[j - 1];
            }

            else if (i < n && str1.charAt(i) != str2.charAt(j)) {
                if (j != 0) {
                    j = prefix_func[j - 1];
                }
                else {
                    i++;
                }
            }
        }

        if (counter == 0) {
            return new int[]{-1};
        }

        index_arr[0] = counter;

        return index_arr;
    }

    public static int[] lookCompute(String str2) {
        int length = 0;
        int m = str2.length();

        int[] prefix_func = new int[m];

        int i = 1;

        while (i < m) {
            if (str2.charAt(i) == str2.charAt(length)) {
                length++;
                prefix_func[i] = length;
                i++;
            }
            else {
                if (length != 0) {
                    length = prefix_func[length - 1];
                }
                else {
                    prefix_func[i] = 0;
                    i++;
                }
            }
        }
        return prefix_func;
    }
}
