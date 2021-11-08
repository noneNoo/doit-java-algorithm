package chap01.quiz;

import java.util.Scanner;

public class Quiz9 {
    static int sumof(int a, int b) {
        int sum = a;

        if(a > b) {
            sum = b;
            for (int i = b; i <= a; i++) {
                sum += i;
            }

        } else {
            for(int i = a; i <= b; i++) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scnInt = new Scanner(System.in);

        System.out.println("임의의 정수 num1을 입력하세요");
        int num1 = scnInt.nextInt();

        System.out.println("num2를 입력하세요");
        int num2 = scnInt.nextInt();

        System.out.println(sumof(num1,num2));
    }
}
