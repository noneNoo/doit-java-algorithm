package chap01;

public class Max3m {
    // 메서드로 만든다
    static int max3(int num1, int num2, int num3){
        int max = num1;

        if(num2 > max) {
            max = num2;
        }

        if(num3 > max) {
            max = num3;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " + max3(3,2,1));
        System.out.println("max3(3,2,2) = " + max3(3,2,2));
        System.out.println("max3(3,1,2) = " + max3(3,1,2));
        System.out.println("max3(3,2,3) = " + max3(3,2,3));
        System.out.println("max3(2,1,3) = " + max3(2,1,3));
        System.out.println("max3(30,22,11) = " + max3(30,22,11));
    }
}
