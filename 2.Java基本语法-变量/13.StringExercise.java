class StringExercise{
    public static void main(String[] args) {
        // 练习1
        char c1 = 'a';//97
        int n1 = 10;
        String str1 = "hello";
        System.out.println(c1 + n1 + str1);//107hello
        System.out.println(c1 + str1 + n1);//ahello10
        System.out.println(c1 + (n1 + str1));//a10hello
        System.out.println((c1 + n1) + str1);//107hello
        System.out.println(str1 + n1 + c1);//hello10a

        // 练习2

        System.out.println("*     *");
        System.out.println('*' + '\t' + '*');//不可以
        System.out.println('*' + "\t" + '*');//可以
        System.out.println('*' + '\t' + "*");//不可以
        System.out.println('*' + ('\t' + "*"));// 可以

    }
}