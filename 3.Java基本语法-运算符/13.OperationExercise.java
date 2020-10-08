class OperationExercise {
    public static void main(String[] args) {
        //第3题
        int x = 10, y = 20, z = 30;
        int max = ((x > y ? x : y) > z) ? (x > y ? x : y) : z;
        System.out.println("x y z中最大值是: " + max);

        //第4题
        double m = 11.0, n = 12.0;
        if (m > 10.0 && n < 20.0) {
            System.out.println("m+n: " + (m + n));
        } else {
            System.out.println("m: " + x + ",n: " + y);
        }

        //第5题
        int i = 10;
        int j = 20;
        i = i ^ j;
        j = i ^ j;
        i = i ^ j;
        System.out.println("i: " + i + ",j: " + j);
    }
}