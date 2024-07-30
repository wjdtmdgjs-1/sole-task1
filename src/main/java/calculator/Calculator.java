package calculator;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> array;// private을 써서 외부에서 접근못하게

    public Calculator(ArrayList<Integer> array){
        this.array = array;
    }

    public int calculate(int n1, int n2, char op){
       int result = 0;

        if (op == '+') {
            result = n1 + n2;

        } else if (op == '-') {
            result = n1 - n2;

        } else if (op == '*') {
            result = n1 * n2;

        } else if (op == '/') {
            if (n2 == 0) {
                System.out.println("0으로 나눌수 없습니다.");
            } else {
                result = n1 / n2;

            }
        }else{
            System.out.println("매개변수를 잘못 입력하였습니다.");
        }
        return result;
    }
    public ArrayList<Integer> getArray(){ // getter 설정
        return array;
    }
    public void setArray(ArrayList<Integer> array){ //setter 설정
        this.array=array;
    }
    public void removeResult(){ // 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드 구현
        array.remove(0);
    }
    public void inquiryResults(){
        System.out.print("[");
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}






