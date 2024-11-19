package 계산기;

import step3.Calculator3;

import java.util.Scanner;

public class 계산기2 {
    class Calculator {
        private double result = 0;
        private int num1 = 0;
        private int num2 = 0;


        public int getNum1() {
            return num1;
        }

        public int getNum2() {
            return num2;
        }

        public double setResult() {
            return result;
        }

        public void setNum1(int num1) {
            this.num1 = num1;
        }

        public void setNum2(int num2) {
            this.num2 = num2;
        }


        class AddOp {
            public double changeresult() {
                result = num1 + num2;
                return result;
            }
        }

        class SubOp {
            public double changeresult() {
                result = num1 - num2;
                return result;
            }
        }

        class MultiOp {
            public double changeresult() {
                result = num1 * num2;
                return result;
            }
        }

        class DivideOp {
            public double changeresult() {
                result = num1 / num2;
                return result;
            }
        }

        public double calculate(int num1, String operator, int num2) {
            this.num1 = num1;
            this.num2 = num2;

            if (operator.equals("-") && num2 == 0) {
                System.out.println("분모에 0이 들어갈수 없습니다.");
            } else {

                if (operator.equals("+")) {
                    AddOp addOp = new AddOp();
                    result = addOp.changeresult();
                } else if (operator.equals("-")) {
                    SubOp subOp = new SubOp();
                    result = subOp.changeresult();
                } else if (operator.equals("*")) {
                    MultiOp multiOp = new MultiOp();
                    result = multiOp.changeresult();
                } else if (operator.equals("/")) {
                    DivideOp divideOp = new DivideOp();
                    result = divideOp.changeresult();
                }
                return result;
            }
            return result;}

            public double getResult () {
                return result;

        }
    }
}
