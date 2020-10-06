class LogicOperationExercise {
    public static void main(String[] args) {
        // 第1题
        int x1 = 1;
        int y1 = 1;
        if (x1++ == 2 & ++y1 == 2) {
            x1 = 7;
        }
        System.out.println("x1 = " + x1 + ",y1 = " + y1);// x1 = 2,y1 = 2

        int x2 = 1;
        int y2 = 1;
        if (x2++ == 2 && ++y2 == 2) {
            x2 = 7;
        }
        System.out.println("x2 = " + x2 + ",y2 = " + y2);// x2 = 2,y2 = 1

        int x3 = 1;
        int y3 = 1;
        if (x3++ == 1 | ++y3 == 2) {
            x3 = 7;
        }
        System.out.println("x3 = " + x3 + ",y3 = " + y3);// x3 = 7,y3 = 2

        int x4 = 1;
        int y4 = 1;
        if (x4++ == 1 || ++y4 == 2) {
            x4 = 7;
        }
        System.out.println("x4 = " + x3 + ",y4 = " + y4);// x4 = 7,y4 = 1

        // 第2题
        boolean x = true;
        boolean y = false;
        short z = 42;
        if ((z++ = 42)&&(y = true)) z++;
        if ((x=false) || (++z==45)) z++;
        System.out.println(z);//46

    }
}