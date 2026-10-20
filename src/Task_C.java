import java.util.Scanner;

public class Task_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        StringBuilder result = new StringBuilder();
        for (long i = 0; i * i <= b; i++) {
            long square = i * i;
            if (square >= a) {
                if (result.length() > 0) result.append(' ');
                result.append(square);
            }
        }

        System.out.print(result);
    }
}