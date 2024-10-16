import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main9 {
    private static Set<String> unique_set = new HashSet<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        generate("", in.nextLine());

        unique_set.stream().sorted().forEach(System.out::println);
    }

    public static void generate(String now, String to_do) {
        if (to_do.isEmpty()) {
            if (now.charAt(0) != '0') {
                unique_set.add(now);
            }
            return;
        }

        for (int i = 0; i < to_do.length(); i++) {
            String new_now = now + to_do.charAt(i);
            String new_to_do = to_do.substring(0, i) + to_do.substring(i + 1);

            generate(new_now, new_to_do);
        }
    }
}
