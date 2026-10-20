import java.util.Scanner;

public class Task_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        StringBuilder result = new StringBuilder();
        for (long i = a; i <= b; i++) {
            if (i % 2 == 0) {
                if (result.length() > 0) result.append(' ');
                result.append(i);
            }
        }

        System.out.print(result);
    }
}