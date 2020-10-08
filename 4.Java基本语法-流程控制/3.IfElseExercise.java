import java.util.Scanner;

class IfElseExercise {
    public static void main(String[] args) {
        // 第1题
        Scanner scan1 = new Scanner(System.in);

        System.out.print("请输入岳小鹏成绩(0-100):");
        int score = scan1.nextInt();

        if (score == 100) {
            System.out.println("奖励一台BMMW");
        } else if (score > 80) {
            System.out.println("奖励一台iphone xs max");
        } else if (score >= 60) {
            System.out.println("奖励一台iPad");
        } else {
            System.out.println("啥也没有");
        }

        // 第2题
        Scanner scan2 = new Scanner(System.in);
        System.out.print("请输入第1个数字:");
        int num1 = scan1.nextInt();
        System.out.print("请输入第2个数字:");
        int num2 = scan1.nextInt();
        System.out.print("请输入第3个数字:");
        int num3 = scan1.nextInt();

        if (num1 >= num2) {
            if (num3 >= num2) {
                System.out.println("顺序: " + num3 + "<" + num2 + "<" + num1);
            } else if (num3 > num1) {
                System.out.println("顺序: " + num1 + "<" + num2 + "<" + num3);
            } else {
                System.out.println("顺序: " + num1 + "<" + num3 + "<" + num2);
            }
        } else {
            if (num3 >= num2) {
                System.out.print("顺序: " + num1 + "<" + num2 + "<" + num3);
            } else if (num3 <= num1) {
                System.out.println("顺序: " + num3 + "<" + num1 + "<" + num2);
            } else {
                System.out.println("顺序: " + num1 + "<" + num3 + "<" + num2);

            }
        }

        // 第3题
        int x = 4;
        int y = 1;
        if (x > 2)
            if (y > 2)
                System.out.println(x + y);
            System.out.println("anti");
        else
            System.out.println("x is " + x);

        // 第4题
        boolean b = true;
        //如果写成b=false，编译可以通过吗?如果能，结果是？
        if (b == false)
            System.out.println("a");
        else if (b)
            System.out.println("b");
        else if (!b)
            System.out.println("c");
        else
            System.out.println("d");

        //执行结果
        // case ==: b
        // cse =: c
    }
}
