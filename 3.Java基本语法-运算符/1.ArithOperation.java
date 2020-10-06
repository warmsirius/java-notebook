class ArithOperation{
    public static void main(String[] args) {
        //除号: /
        int n1 = 12;
        int n2 = 5;
        int res1 = n1 / n2;
        System.out.println(res1);// 2

        int res2 = n1 / n2 * n2;
        System.out.println(res2);// 10

        double res3 = n1 / n2;
        System.out.println(res3);// 2.0
        double res4 = n1 / n2 + 0.0;
        System.out.println(res4);// 2.0

        double res5 = n1 / (n2 + 0.0); // 2.4，因为n2+0.0后类型被自动提升为double，然后是double运算
        System.out.println(res5);// 2.4

        double res6 = (double)n1 / n2;
        System.out.println(res6);// 2.4

        double res7 = (double)(n1 / n2);
        System.out.println(res7);// 2.0

        //取余运算: %
        int m1 = 12;
        int m2 = 5;
        int res8 = m1 % m2;
        System.out.println("m1 % m2 = " + res8);// 2

        int m3 = -12;
        int m4 = 5;
        int res9 = m3 % m4;
        System.out.println("m3 % m4 = " + res9);// -2

        int m5 = 12;
        int m6 = -5;
        int res10 = m5 % m6;
        System.out.println("m5 % m6 = " + res10);// 2

        int m7 = -12;
        int m8 = -5;
        int res11 = m7 % m8;
        System.out.println("m7 % m8 = " + res11);// -2

        //(前)++
        //(后)++
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = " + a1 + ", b1 = " + b1);// a1 = 11, b1 = 11

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = " + a2 + ", b2 = " + b2);// a2 = 11, b2 = 10


        //(前)--
        //(后)--
        int a3 = 10;
        int b3 = --a3;
        System.out.println("a3 = " + a3 + ", b3 = " + b3);// a3 = 9, b3 = 9

        int a4 = 10;
        int b4 = a4--;
        System.out.println("a4 = " + a4 + ", b4 = " + b4);// a4 = 9, b4 = 10;

        short s1 = 10;
        s1 = (short)(s1 + 1);
        System.out.println(s1);// 11
        // 自增1不会改变本身变量类型
        s1++;
        System.out.println(s1);// 11

        // byte++超过范围
        byte b0 = 127;
        b0++;
        System.out.println("b0 = " + b0);// -128


    }
}