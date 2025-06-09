import java.util.Scanner; // 필요한 클래스 import

public class ScannerParse { // 클래스 정의 시작
    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("숫자를 입력하세요: ");
            String input = scanner.nextLine(); // 변수 선언 또는 초기화

            try { // 예외가 발생할 수 있는 코드 블록 시작
                int number = Integer.parseInt(input); // 변수 선언 또는 초기화
                System.out.println("입력한 숫자: " + number); // 콘솔에 메시지 출력
            } catch (NumberFormatException e) { // 예외가 발생했을 때 처리하는 블록
                System.out.println("유효하지 않은 숫자입니다."); // 콘솔에 메시지 출력
            } // 코드 블록 종료
        }
    } // 코드 블록 종료
} // 코드 블록 종료