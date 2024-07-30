package calculator;

import java.util.ArrayList;

public class Calculator {

    static final double PI = 3.141592; // PI값은 변하지않으니 static final 사용
    private ArrayList<Double> array;// private을 써서 외부에서 접근못하게


    public Calculator(ArrayList<Double> array){
        this.array = array;
    }
    public double calculateCircleArea(int r1){
        double result=0;
        result = r1*r1*PI;
        return  result;
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
    public ArrayList<Double> getArray(){ // getter 설정
        return array;
    }
    public void setArray(ArrayList<Double> array){ //setter 설정
        this.array=array;
    }
    public void removeResult(){ // 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드 구현
        array.remove(0);
    }
    public void inquiryResults(){
        System.out.print("[");
        for (double i : array) {
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}






