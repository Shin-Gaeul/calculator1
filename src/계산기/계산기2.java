package 계산기;

import step3.Calculator3;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class 계산기2 {
    class Calculator {
        private List<Double> results = new ArrayList<>();


        public void removeResult() {
            if (!results.isEmpty()) {
                results.remove(0);
                System.out.println("첫번째 결과를 삭제하였습니다");
            } else {
                System.out.println("삭제할 데잌터가 없습니다.");
            }
        }

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
                if (num2 == 0) {
                   System.out.println( "분모에는 0이 들어갈수 없습니다");
                    return 0;
                }
                else {
                    result = num1 / num2;
                    return result;
                }
            }
        }

        public double calculate(int num1, String operator, int num2) {
            this.num1 = num1;
            this.num2 = num2;


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
            addResult(result);
            System.out.println("현재 results 리스트: " + results);
            return result;
        }


        public void addResult(double result) {
            results.add(result);
        }

        public List<Double> getResults() {
            return new ArrayList<>(results);
        }

        public double getResult() {
            if (results.isEmpty()) {
                return 0; // 결과가 없으면 0 반환
            }
            return results.get(results.size() - 1); // 마지막 값 반환
        }
    }
}
