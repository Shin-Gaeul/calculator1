package 계산기;

import java.util.Scanner;

public class 계산기1 {
    public static void main(String[] args) {
        int num1=1;
        while (num1<=100){
            num1++;
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        String c = sc.next();
        int b = sc.nextInt();

        int d;
       if (c.equals("/")&& b==0){
           System.out.println("분모에 0이 들어갈수 없습니다");}
       else { if (!c.equals("+")&& !c.equals("-")&& !c.equals("*")&& !c.equals("/")){
           System.out.println("계산할 수 없는 연산자입니다.");
       } else {
           if (c.equals("+")){
            d=a+b;
            System.out.println(a+"+"+b+"="+d);
        }
        else {
            if (c.equals("-")) {
                d=a-b;
                System.out.println(a+"-"+b+"="+d);
            } else {
                if (c.equals("*")){
                    d=a*b;
                    System.out.println(a+"*"+b+"="+d);
                } else {
                    if (c.equals("/")) {
                        d=a/b;
                        System.out.println(a+"/"+b+"="+d);
                    } else {  System.out.println("계산할 수 없습니다1");}
                }
            }
        }}}
       System.out.println("계속하시겠습니까?");
       String end = sc.next();
       if (end.equals("exit")){
           break;
       }
        }
    }
}
