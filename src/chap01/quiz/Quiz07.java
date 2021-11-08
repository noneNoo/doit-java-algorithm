package chap01.quiz;

import java.util.Scanner;

// n 의 값에 따라 1 + 2 + 3 + 4 ... + n = sum 로 출력하는 프로그램
public class Quiz07 {
    public static void main(String[] args) {
        Scanner scnInt = new Scanner(System.in);

        int sum = 0;

        System.out.println("임의의 n 값을 입력하세요. ");
        int n = scnInt.nextInt();

        for(int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(i);
            // 마지막 "+" 는 출력하지 않기 위해
            if (i == n) {
                break;
            }
            System.out.print(" + ");
        }
        System.out.print(" = " + sum);
    }
}
