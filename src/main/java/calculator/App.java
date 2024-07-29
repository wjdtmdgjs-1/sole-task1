package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int count =0; // 인덱스값
        int[] array = new int[10]; // 배열 선언 및 생성

        Scanner sc = new Scanner(System.in);
        while (true) {
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
            int result = 0;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("0으로 나눌수 없습니다.");
                } else {
                    result = num1 / num2;
                }
            }
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            array[count] = result; // 결과값이 0번부터 저장되도록
            for(int i=0;i<=count;i++){
                System.out.print(array[i]);
            }



            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            sc.nextLine(); // 자꾸 넘어가서 개행문자를 받아줌
            String text = sc.nextLine();

            if (text.equals("exit")){ // exit 치면 빠져나가고 아님 계속 무한 계산하게
                break;
            }else{
                count +=1; // 인덱스값 증가시켜줌
                if(count==10){ // count값이 10이 되면 젤 앞에 수를 지워주고 한칸씩 앞으로 옮겨준다.
                    for(int i=1;i<10;i++){
                        array[i-1]=array[i];
                    }
                    count -=1;// count값을 다시 9로 낮춰준다.
                }
            }


        }
    }
}