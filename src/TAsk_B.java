import java.util.Scanner;

public class TAsk_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        StringBuilder result = new StringBuilder();
        for (long i = a; i <= b; i++) {
            if (i % d == c) {
                if (result.length() > 0) result.append(' ');
                result.append(i);
            }
        }

        System.out.print(result);
    }
}