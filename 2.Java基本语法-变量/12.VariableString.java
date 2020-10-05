class VariableString{
    public static void main(String[] args) {
        String s = "";
        //char c = '';//编译不通过


        String str = "abc";
        System.out.println(str);

        // String串接另一个字符串
        str += "xyz";
        System.out.println(str);

        // **********String和基础类型连接运算**********
        // String连接整型
        int n = 100;
        str += n;
        System.out.println(str);

        // String连接浮点型
        float f = 1.234F;
        str += f;
        System.out.println(str);



    }
}