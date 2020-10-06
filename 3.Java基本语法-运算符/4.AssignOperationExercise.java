class AssignOperationExercise{
    public static void main(String[] args) {

        short s = 3;
        //s = s + 2;//①
        s += 2;//②
        // 问题: ①和②有什么区别？
        // 答: ①编译错误，②执行正确

        int i = 1;
        i *= 0.1;
        System.out.println(i);//0
        i++;
        System.out.println(i);//1


        int m = 2;
        int n = 3;
        n *= m++;
        System.out.println("m = " + m);//m = 3;
        System.out.println("n = " + n);//n = 6;

        int n1 = 10;
        n1 += (n1++) + (++n1);// n1 = n1 + (n1++) + (++n1) n1 = 10 + 10 + 12
        System.out.println("n1 = " + n1);//n1 = 32;



    }
}