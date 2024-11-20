package 계산기;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //calculator 객체
        계산기2 cal2 = new 계산기2();
        계산기2.Calculator calculator = cal2.new Calculator();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("계산하시겠습니까?");
            String answer = sc.next();
            if (answer.equals("exit")) {
                break;
            }
            if (answer.equals("Delete")) {
                calculator.removeResult();
                continue;
            }


            System.out.println("첫번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.println("두번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();

            System.out.println("연산기호를 입력하세요 : ");
            String operator = sc.next();

            calculator.calculate(num1, operator, num2);


            double result = 0.0; // 기본값 설정

            if (!calculator.getResults().isEmpty()) {
                result = calculator.getResults().get(calculator.getResults().size() - 1);
                System.out.println("계산결과는 "+result);
            } else {
                System.out.println("결과값이 없습니다");
            }

        }while (true);

    }

}

