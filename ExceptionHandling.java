public class ExceptionHandling { // 클래스 정의 시작
    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        
        try { // 예외가 발생할 수 있는 코드 블록 시작
            String text = null; // 변수 선언 또는 초기화
            System.out.println(text.length()); // 콘솔에 메시지 출력
            
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
            
            int result = 10 / 0; // ArithmeticException
            
            Object obj = "문자열";
            Integer number = (Integer) obj; // ClassCastException
            
        } catch (NullPointerException e) { // 예외가 발생했을 때 처리하는 블록
            System.out.println(e.getMessage()); //콘솔에 메세지 출력
            System.out.println("예외 발생: null 객체를 참조했습니다."); //콘솔에 메세지 출력
            
            //Exception Block 을 3개 더 추가
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("예외 발생: 배열 인덱스가 범위를 벗어났습니다.");
            
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("예외 발생: 0으로 나눌 수 없습니다.");
            
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
            System.out.println("예외 발생: 잘못된 형변환입니다.");
            
        } finally { //코드 블록 종료
            System.out.println("예외 처리 완료."); // 콘솔에 메시지 출력
        } //코드 블록 종료
    } //코드 블록 종료
} //코드 블록 종료
