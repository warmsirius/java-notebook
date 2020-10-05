class VariableClass{
    public static void main(String[] args) {
        //char: 字符型，占用2字节，通常使用一对单引号''
        char c1 = 'a';
        System.out.println(c1);
        char c2 = '中';
        System.out.println(c2);
        char c3 = '3';
        System.out.println(c3);

        //char: 转义字符
        char c4 = '\n';
        char c5 = '\t';
        System.out.println("hello" + c4);
        System.out.println(c5 + "World!");

        //char: Unicode字符表示，
        char c6 = '\u0123';
        System.out.println(c6);




    }
}