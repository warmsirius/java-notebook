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
        System.out.println("请输入第1个数字: ");
        int m = scan.nextInt();
        System.out.println("请输入第2个数字: ");
        int n = scan.nextInt();

        //获取最大公约数
        int maxCommonDivison = 1;
        int smaller = m > n ? n : m;
        for (int i = smaller; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                maxCommonDivison = i;
                break;//一旦找到了第一个就跳出循环
            }
        }

        System.out.println("最大公约数是: " + maxCommonDivison);

        //获取最小公倍数
        int bigger = m < n ? n : m;
        int smallerCommonMulti = bigger;
        for (int i = bigger; i <= m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                smallerCommonMulti = i;
                break;
            }
        }
        System.out.println("最小公倍数是: " + smallerCommonMulti);

        //4. 水仙花数
        for (int i = 153; i < 1000; i++) {
            int n1 = i / 100;
            int n2 = i % 100 / 10;
            int n3 = i % 10;
            if (i == n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3) {
                System.out.println("水仙花数: " + i);
            }


        }
    }
}