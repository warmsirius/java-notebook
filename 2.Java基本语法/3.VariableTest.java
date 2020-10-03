class VariableTest{
    public static void main(String[] args) {
        // 变量的定义
        int myAge = 20;
        // 变量的使用
        System.out.println(myAge);

        // 编译错误: 使用myNumber之前未定义过myNumber
        //System.out.println(myNumber);


        // 变量的声明
        int myNumber;
        // 编译错误: 使用myNumber之前并未赋值过myNumber
        //System.out.println(myNumber);

        // 变量的赋值
        myNumber = 100;
        System.out.println(myNumber);

        // 编译错误: myClass不在main方法的作用域内
        //System.out.println(myClass);

        // 编译错误: 不可以在同一个作用域内定义同名的变量
        //int myAge = 22;


    }
    public void method(){
        int myClass = 1;

    }
}