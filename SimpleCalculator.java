import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("첫 번째 숫자: ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자: ");
            int b = sc.nextInt();
            System.out.println("합: " + (a + b)); // 합계 출력
            System.out.println("차: " + (a - b)); // 차이 출력
            System.out.println("곱: " + (a * b)); // 곱 출력
        }
    }
}