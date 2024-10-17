package Calculator02;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        double first=0, second=0;
        String operate;
        String historyYN;
        boolean contin = true;
        int historyNum;
        int content;
        while(contin) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            first = scanner.nextDouble();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("두 번째 숫자를 입력하세요: ");
            second = scanner.nextDouble();
            System.out.print("사칙연산 기호를 입력하세요: ");
            operate = String.valueOf(scanner.next().charAt(0));
            calculator.calculate(first, second, operate);
            System.out.println("어떤것을 수행하시겠습니까? (1.계산하기  2.기록보기  3.끝내기");
            content = scanner.nextInt();

            switch (content) {
                case 1:


                   break;
                case 2:
                    calculator.historyGet();
                    System.out.println("삭제하고싶은 기록의 번호를 말해주세요");
                    historyNum = scanner.nextInt();
                    calculator.historyDelete(historyNum);
                    break;
                case 3:
                    contin = false;
                    break;
            }

        }
    }
}
