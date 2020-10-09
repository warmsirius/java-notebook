class ForTest {
    public static void main(String[] args) {
        /*
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
         */

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        int num = 1;
        for( System.out.print("a");num<=3; System.out.print("c"),num++){
            System.out.print("b");
        }
        //输出结果
        //abcbcbc
    }
}