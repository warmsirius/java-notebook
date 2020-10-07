class SanYuanOperation {
    public static void main(String[] args) {
        //获取两个整数的较大值
        int m = 12;
        int n = 5;
        int max = (m > n) ? m : n;
        System.out.println(max);

        double num = (m > n) ? 2 : 1.0;
        System.out.println(num);

        // 编译错误:
        //(m > n) ? 2 : "n大";

        String maxStr = (m > n) ? "m大" : ((m == n) ? "m和n相等" : "n大");
        System.out.println(maxStr);

        // 获取三个数的最大值
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int max1 = (n1 > n2) ? n1 : n2;
        int max2 = (max1 > n3) ? max1 : n3;
        System.out.println("三个数中的最大值为:" + max2);

        //编译错误
        //int max3 = (n1 > n2):?((n1 > n3) ? n1 : n3):((n2 > n3) ? n2 : n3);
        //System.out.println("三个数中的最大值为:" + max3);

        //不建议这样写
        int max4 = (((n1 > n2) ? n1 : n2) > n3) ? ((n1 > n2) ? n1 : n2) : n3;
        System.out.println("三个数中的最大值为:" + max4);

        //改写成if-else


    }
}