class ArithOperationExercise{
    public static void main(String[] args) {
        // 第1题:
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.println("i = " + i);// i = 10
        System.out.println("i1 = " + i1);// i1 = 11

        i = ++i1;
        System.out.println("i = " + i);// i = 12;
        System.out.println("i1 = " + i1);// i1 = 12

        i = i2--;
        System.out.println("i = " + i);// i = 20
        System.out.println("i2 = " + i2);// i2 = 19

        i = --i2;
        System.out.println("i = " + i);// i = 18
        System.out.println("i2 = " + i2);// i2 = 18

        // 第2题:
        int n = 1253;

        int digits = n % 10;
        int tmp = n / 10;
        int tensDigits = tmp % 10;
        tmp = tmp / 10;
        int hundredsDigits = tmp % 10;
        System.out.println("数字" + n + "的情况如下:");
        System.out.println("个位数: " + digits);
        System.out.println("十位数: " + tensDigits);
        System.out.println("百位数: " + hundredsDigits);
    }
}