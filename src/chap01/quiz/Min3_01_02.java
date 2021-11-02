package chap01.quiz;

import java.util.Scanner;

public class Min3_01_02 {
    static int min3(int a, int b, int c) {
        int min = a;

        if(min > b) {
            min = b;
        }
        if(min > c) {
            min = c;
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("3개의 정수를 입력하세요. 최소값을 구합니다.");

        System.out.print("첫 번째 정수: ");
        int a = scn.nextInt();
        System.out.print("두 번째 정수: ");
        int b = scn.nextInt();
        System.out.print("세 번째 정수: ");
        int c = scn.nextInt();

        // 결과
        System.out.println(a + ", " + b + ", " + c + ", " + "중 최소값: " + min3(a,b,c));
    }
}
