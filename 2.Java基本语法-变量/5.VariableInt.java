class VariableInt {
    public static void main(String[] args) {
        // 1.整型: byte(1字节=8bit) -128~127
        byte b1 = 12;
        byte b2 = -128;
        // 编译错误: 超出范围，不兼容类型
        //b2 = 128;

        System.out.println(b1);
        System.out.println(b2);

        // 2.整型: short(2字节=16bit)
        short s1 = 128;
        System.out.println(s1);


        // 3.整型: int(4字节=32bit)
        int i1 = 128888;
        System.out.println(i1);

        // 4.整型: long(8字节=64bit)
        long l1 = 34128473209L;
        System.out.println(l1);


    }
}