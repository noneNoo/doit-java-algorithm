package chap01.quiz;

import java.util.Scanner;

public class Min4_01_03 {
    static int min4(int a, int b, int c, int d) {
        int min = a;

        if(min > b) {
            min = b;
        }
        if(min > c) {
            min = c;
        }
        if(min > d) {
            min = d;
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("4개의 정수를 입력하세요. 최소값을 구합니다.");

        System.out.print("첫 번째 정수: ");
        int a = scn.nextInt();
        System.out.print("두 번째 정수: ");
        int b = scn.nextInt();
        System.out.print("세 번째 정수: ");
        int c = scn.nextInt();
        System.out.print("네 번째 정수: ");
        int d = scn.nextInt();

        // 결과
        System.out.println(a + ", " + b + ", " + c + ", " + d + "중 최소값: " + min4(a,b,c,d));
    }
}
