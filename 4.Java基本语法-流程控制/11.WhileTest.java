class WhileTest{
    public static void main(String[] args) {
        // 遍历100以内所有偶数
        int i = 1;
        while(i<100){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
        //出了while仍然可以调用i
        System.out.println(i);
    }
}