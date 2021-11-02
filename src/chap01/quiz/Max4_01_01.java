package chap01.quiz;

import java.util.Scanner;

// 네 값을 매개변수로 받아와 최댓값을 리턴하는 메서드를 작성하세요.
public class Max4_01_01 {
    static int max4(int a, int b, int c, int d) {
        int max = a;

        if(max < b) {
            max = b;
        }
        if(max < c) {
            max = c;
        }
        if(max < d) {
            max = d;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("4개의 정수를 입력하세요. 최대값을 구합니다.");

        System.out.print("첫 번째 정수: ");
        int a = scn.nextInt();
        System.out.print("두 번째 정수: ");
        int b = scn.nextInt();
        System.out.print("세 번째 정수: ");
        int c = scn.nextInt();
        System.out.print("네 번째 정수: ");
        int d = scn.nextInt();

        // 결과
        System.out.println(a + ", " + b + ", " + c + ", " + d + "중 최대값: " + max4(a,b,c,d));

    }
}
