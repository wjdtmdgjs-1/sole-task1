package calculator;

import java.util.ArrayList;

public class Calculator {

    public ArrayList<Integer> array = new ArrayList<>();


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



}
