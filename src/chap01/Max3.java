package chap01;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {

        //3개의 정수값을 입력받기
        Scanner scn = new Scanner(System.in);
        System.out.println("세 정수를 입력해주세요. 최대값을 구합니다.");
        System.out.printf("첫 번째 정수: "); int num1 = scn.nextInt();
        System.out.printf("두 번째 정수: "); int num2 = scn.nextInt();
        System.out.printf("세 번째 정수: "); int num3 = scn.nextInt();

        int max = num1;

        if(max < num2) {
            max = num2;
        }

        if(max < num3) {
            max = num3;
        }
        System.out.print("세 정수 중 최대 값은: " + max +" 입니다.");
    }

}
