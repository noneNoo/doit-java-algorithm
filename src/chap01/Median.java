package chap01;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c) {
        if(a <= b) {
            if(b <= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if(a < c) {
            return b;
        } else if (b < c) {
            return c;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a, b, c;
        System.out.print("첫 번째 정수: ");
        a = scn.nextInt();
        System.out.print("두 번째 정수: ");
        b = scn.nextInt();
        System.out.print("세 번째 정수: ");
        c = scn.nextInt();

        // 결과
        System.out.println(a + ", " + b + ", " + c + ", " + "중 중간값: " + med3(a,b,c));
    }
}
