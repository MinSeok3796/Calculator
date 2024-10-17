package Calculator02;
import java.util.*;
public class Calculator {

    private final ArrayList<Double> history = new ArrayList<>();
    Operation operation;
    private double result=0;

    public void historyGet(){
        if (history.isEmpty()) {
            System.out.println("저장된 기록이 없습니다.");
        } else {
            System.out.println("계산 기록:");
            for (int i = 0; i < history.size(); i++) {
                System.out.println((i + 1) + ": " + history.get(i));
            }
            System.out.println();
        }

    }


    public void historyDelete(int index){
        if (history.isEmpty()) {
            System.out.println("삭제할 기록이 없습니다.");
        }else{
            history.remove(index-1);
            System.out.println("기록이 삭제되었습니다.");
            System.out.println("남아있는 기록 : ");
            for (int i = 0; i < history.size(); i++) {
                System.out.println((i + 1) + ": " + history.get(i));
            }
            System.out.println();
        }

    }



    public Calculator(){} //생성자

    public double calculate(double first, double second, String operate) {

        switch(operate){
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubstractOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                if( second == 0 ) {
                    System.out.println("계산을 수행할 수 없습니다.");
                    break;
                }else{
                    operation = new DivOperation();
                    break;
                }
            default:
        }
        operation.setNum(first, second);
        result = operation.operate();
        System.out.println("계산결과 입니다: " + result);
        history.add(result);
        return result;
    }

}
