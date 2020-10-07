class BitOperationExercise{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        //方式一: 定义临时变量tmp1，推荐方式
        int tmp1 = num1;
        num1 = num2;
        num2 = tmp1;
        System.out.println(num1);
        System.out.println(num2);

        //方式二: 位运算异或，弊端:有局限性，只能对应于数值类型
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println(num1);
        System.out.println(num2);

        //方式三: 好处: 不用定义临时变量，弊端: ①可能和会超出本身变量存储范围 ②有局限性，只能对应于数值类型
        num1 = num2 + num1;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1);
        System.out.println(num2);

    }
}