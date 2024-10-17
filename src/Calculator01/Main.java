package Calculator01;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int result = 0;
            System.out.println("첫번째 수 : ");
            int num1 = sc.nextInt();
            System.out.println("두번째 수 : ");
            int num2 = sc.nextInt();    // 1,2번 숫자 입력받기 완료

            //사칙연산 입력받기
            System.out.println("수행하실 사칙연산을 입력해주세요 ");
            char operate = sc.next().charAt(0);
            switch (operate) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("제대로된 연산이 입력되지 않았습니다.");
                    break;
            }
            System.out.println(num1 + " " + operate + " " + num2 + " = " + result);  // num1, operate, num2를 이어붙이게 되면 아스키 코드 값이 나타나는 현상이 있음
            sc.nextLine();
            System.out.println("더 하실래요?  ps.exit를 입력하시면 종료됩니다.");
            String answer = sc.nextLine();
            if(answer.equals("exit"))
                break;

        }
    }
}