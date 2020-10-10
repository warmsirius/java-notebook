class BreakContinueTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                continue;
            }
            System.out.println(i);
        }

        label:
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    //break;//默认跳出包裹break的最近一层循环
                    //break label;//结束指定标识的一层循环结构
                    continue label;//结束指定标识的一层循环结构的当次循环
                }
                System.out.print(i);
            }
            System.out.println();
        }
    }
}