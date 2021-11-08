package chap01.quiz;

import java.util.Scanner;

// 가우스의 덧셈 (짝수의 경우)
/*
* 1부터 10까지의 합은
* (1 + 10) * 5
*
* 1부터 n까지의 합은 그럼
* (1 + n) * (n / 2)
* */
public class Quiz08 {
    public static void main(String[] args) {

        Scanner scnInt = new Scanner(System.in);

        System.out.println("임의의 짝수를 입력하세요.");

        int n = scnInt.nextInt();
        int sum = 0;

        if(n % 2 == 0) {
            sum = (1 + n) * (n/2);
        } else {
            System.out.println("홀수를 입력하다니");
            for(int i = 0; i < n; i++) {
                sum += i;
            }
        }

        System.out.println(sum);

    }
}