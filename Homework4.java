import java.util.Scanner;

public class Homework4 {

    public static int gcd(int m, int n) {
        while (n != 0) {
            int smaller = Math.min(m, n);
            int larger = Math.max(m, n);

            m = smaller;
            n = larger % smaller;
        }

        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int result = gcd(m, n);

        System.out.println("두 수의 최대공약수는 " + result + "입니다.");

        scanner.close();
    }
}