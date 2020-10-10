class NestedCycle {
    public static void main(String[] args) {

        //******
        //System.out.println("******")

        for (int i = 1; i <= 6; i++) {
            System.out.print("*");
        }
        System.out.println();


        /*
         ******
         ******
         ******
         ******
         */

        for (int j = 1; j <= 6; j++) {
            for (int i = 1; i <= 6; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /*
         *
         **
         ***
         ****
         *****
         ******
         */
        for (int j = 1; j <= 6; j++) {//控制行数
            for (int i = 1; i <= j; i++) {//控制列数
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         ******
         *****
         ****
         ***
         **
         *
         */
        for (int j = 1; j <= 6; j++) {//控制行数
            for (int i = 1; i <= 6-j; i++) {//控制列数
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         *
         **
         ***
         ****
         *****
         ******
         *****
         ****
         ***
         **
         *
         */
        // 上面2个代码拼起来就可以了

    }
}