package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArithmeticCalculator cal = new ArithmeticCalculator(new ArrayList<>()); // 생성자를 이용해  초기화
        CircleCalculator cal2 = new CircleCalculator(new ArrayList<>()); // 생성자를 이용해  초기화


        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("선택 (원의넓이 : O, 사칙연산 : x)"); // 원의 넒이 구할지 사칙연산할지 고르기.
            char pick = sc.next().charAt(0);
            if (pick == 'O'){
                System.out.println("원의 반지름을 입력하세요");
                int rad = sc.nextInt();
                double result=0;
                result = cal2.calculateCircleArea(rad);
                cal2.getArray().add(result); //결과값 저장
                System.out.println("원의 넓이 =" + result);
                cal2.inquiryResults(); // 저장된 넓이값들 바로 출력

                sc.nextLine();
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                sc.nextLine();
                String text = sc.nextLine();

                    if (text.equals("exit")){ // exit 치면 빠져나가고 아님 계속 무한 계산하게
                        break;
                    }

            }else if(pick == 'X'){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /
            char operator = sc.next().charAt(0); // charAt(0) : 입력받는값을 char로 변환해준다.
            //원래 scanner는 String으로 받아줘야된다.
            // charAt('인덱스값')

            double result =0; // double로 변경해준다.


            result = cal.calculate(num1, num2, operator);

            cal.getArray().add(result); /* getter로 받아주기. setter로 받을 수 있으나 지금 배열 전체를 바꾸는것이 아니라
            하나를 추가하거나 제거하는 것이기 때문에 getter 로 받아서 하는것. setter로 받을 경우 4번째 값을 넣어줄때 앞에 3개의
            값들을 모두 넣어 새로운 배열을 만들어야 되기에 이경우 getter로 사용한다.*/

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);


            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까?(remove 입력)");
            sc.nextLine();
            String text2 = sc.nextLine();
            if(text2.equals("remove")) {// method 사용할 수 있게 바꿔줌
                cal.removeResult();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            //sc.nextLine();
            String text3 = sc.nextLine();
            if(text3.equals("inquiry")){// method 사용할 수 있게 바꿔줌
               cal.inquiryResults();
            }

            System.out.println("");

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            //sc.nextLine(); // 자꾸 넘어가서 개행문자를 받아줌
            String text = sc.nextLine();

            if (text.equals("exit")){ // exit 치면 빠져나가고 아님 계속 무한 계산하게
                break;
            }
            }else{
                System.out.println("다시 입력해주세요");

            }

        }


    }
}
