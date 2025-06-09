public class ScopeExample { // 클래스 정의 시작
    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        int x = 10; // 변수 선언 또는 초기화
        if (x > 5) { // 조건문 시작
            int y = 20; // 변수 선언 또는 초기화
            System.out.println("y는 블록 내부에서만 사용 가능: " + y); // 콘솔에 메시지 출력
        } // 코드 블록 종료
        // System.out.println(y); // 오류 발생: y는 if 블록 외부에서 사용 불가
    } // 코드 블록 종료
} // 코드 블록 종료