class BaseVariableAutoPrompt{
    //基本数据类型之间的运算规则
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 129;
        //编译不通过
        //byte b2 = b1 + i1;
        int i2 = b1 + i1;
        System.out.println(i2);

        // 用long接收也可以
        long l1 = b1 + i1;
        System.out.println(l1);


        // 用float接收也可以，如果是整型，float会补上.0
        float f1 = b1 + i1;
        System.out.println(f1);


        //***************特别的**********************

        // char类型
        // char和int运算，值用int接收
        char c1 = 'a';//97
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        //char和short运算，值用int接收
        char c2 = 'b';
        short s1 = 1234;
        // 编译错误: 不兼容，从int转换到char可能会有损失
        // short s3 = c2 + s1;
        int i5 = c2 + s1;
        System.out.println(i5);

        // char和byte运算，值用int接收
        char c3 = 'c';
        byte b2 = 10;
        //编译错误: 不兼容，从int转换到char可能会有损失
        //char c4 = c3 + b2;
        int i6 = c3 + b2;
        System.out.println(i6);
    }
}