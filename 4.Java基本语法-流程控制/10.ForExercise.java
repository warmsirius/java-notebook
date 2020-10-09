import java.util.Scanner;

class ForExercise {
    public static void main(String[] args) {
        // 1. 遍历100以内的偶数
        int sumEven = 0;
        for (int i = 0; (i < 100); i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
        System.out.println("100以内的偶数和为: " + sumEven);

        // 2.
        for (int i = 1; i <= 150; i++) {
            System.out.print(i);
            if (i % 3 == 0) {
                System.out.print(" " + "foo");
            }
            ;
            if (i % 5 == 0) {
                System.out.print(" " + "biz");
            }
            ;
            if (i % 7 == 0) {
                System.out.print(" " + "baz");
            }
            ;
            System.out.println();


        }

        //3.最大公约数和最小公倍数
        Scanner scan = new Scanner(System.in);
        S
        int m = scan.nextInt();
        int n = scan.nextInt();
        int maxCommonDivisor = 1;
        int smaller = m > n ? n : m;
        for(int i=2; i<=smaller; i++){
            if(m%i == 0 && n % i==0){
                maxCommonDivisor = i;
            }
        }

        if (maxCommonDivisor != 1){
            System.out.println("最大公约数是: " + maxCommonDivisor);

        }




    }
}