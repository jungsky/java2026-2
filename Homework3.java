import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 입력받을 정수의 개수 입력
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int count = scanner.nextInt();

        // 입력받은 개수만큼 배열 생성
        int[] numbers = new int[count];

        // 정수 입력
        System.out.print("수를 입력하세요: ");

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 배열의 첫 번째 값을 최대값과 최소값으로 초기화
        int max = numbers[0];
        int min = numbers[0];

        // 배열을 순회하며 최대값과 최소값 찾기
        for (int i = 1; i < numbers.length; i++) {

            // 현재 값이 최대값보다 크다면 최대값 갱신
            if (numbers[i] > max) {
                max = numbers[i];
            }

            // 현재 값이 최소값보다 작다면 최소값 갱신
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        scanner.close();
    }
}