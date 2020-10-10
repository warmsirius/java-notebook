class NestedCycleExercise {
    public static void main(String[] args) {
        //1.打印99乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + " = " + i * j + "  ");
            }
            System.out.println();
        }

        //2.100以内所有的质数
        // 方式一:
        long startTm = System.currentTimeMillis();
        for (int i = 2; i < 100; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.println(i);
            }

        }

        long endTm = System.currentTimeMillis();
        System.out.println("花费时间为: " + (endTm - startTm));


        // 方式二: 不用到i-1，直接到根号i
        for (int i = 2; i < 100; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.println(i);
            }

        }

    }
}