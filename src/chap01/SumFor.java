package chap01;

import java.util.Scanner;

// 1부터 n까지 구하기
// for문 이용
public class SumFor {
    public static void main(String[] args) {
        Scanner scnInt = new Scanner(System.in);

        System.out.println("임의의 숫자 하나를 입력하세요");
        int n = scnInt.nextInt();
        System.out.println("1부터 정수 " + n + "까지의 합은?");

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println();
        System.out.println("1 부터 " + n + "까지의 합 : " + sum);

    }

}
