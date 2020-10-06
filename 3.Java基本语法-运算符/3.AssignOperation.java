class AssignOperation{
    public static void main(String[] args) {
        // 赋值符号: =
        int i1 = 10;
        int j1 = 10;

        int i2, j2;
        // 连续赋值
        i2 = j2 = 10;
        int i3 = 10, j3 = 20;

        //********************
        int n1 = 10;
        n1 += 2; // n1 = n1 + 2;
        System.out.println(n1);// 12

        int n2 = 12;
        n2 %= 5;// n2 = n2 % 5;
        System.out.println(n2);// 2

        short s1 = 12;
        // s1 = s1 + 2; // 编译失败
        s1 += 2;
        System.out.println(s1);// 2

        byte b1 = 127;
        b1 *= 2;
        System.out.println(b1);// -2

    }

}