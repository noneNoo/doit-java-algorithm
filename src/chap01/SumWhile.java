package chap01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner scnInt = new Scanner(System.in);

        System.out.println("임의의 숫자를 입력하세요.");

        int n = scnInt.nextInt();

        System.out.println("1부터 " + n + "의 합을 구합니다.");

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i ++;
        }
        System.out.println("1 부터 " + n + "까지의 합 : " + sum);
    }
}
