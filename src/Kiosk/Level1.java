package Kiosk;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "1. ShackBurger  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거";
        String b = "2. SmokeShack.  | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거";
        String c = "3. CheeseBurger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거";
        String d = "4. HamBurger.   | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거";
        String e = "0. 종료          | 종료";


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        do {
            int f = sc.nextInt();
            if (f == 0) {
                System.out.println(e);
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (f==1) {
                System.out.println(a);
            } else if (f==2) {
                System.out.println(b);
            } else if (f==3) {
                System.out.println(c);
            } else if (f==4) {
                System.out.println(d);
            } else {
                System.out.println("없는 메뉴입니다");
            }

        } while (true);
    }


}
