class BitOperation{
    public static void main(String[] args) {
        //
        int i = 21;
        System.out.println("i << 2: " + (i << 2));// 21 * 2 * 2
        System.out.println("i << 26: " + (i << 26));// i << 26: 1409286144
        System.out.println("i << 27: " + (i << 27));// i << 27: -1476395008
        System.out.println("i >> 2: " + (i >> 2));// 21 / 2 / 2 = 5.25 取整 5

        int m=12;
        int n = 5;
        System.out.println("m & n: " + (m & n));// m & n: 4
        System.out.println("m | n: " + (m | n));// m | n: 13
        System.out.println("m ^ n: " + (m ^ n));// m ^ n: 9
        System.out.println("m >> n: " + (m >> n));// m >> n: 0
        System.out.println("m << n: " + (m << n));// m << n: 384
    }
}
