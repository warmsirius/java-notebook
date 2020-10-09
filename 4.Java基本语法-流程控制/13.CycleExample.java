import java.util.Scanner;

class CycleExample {
    public static void main(String[] args) {
        //1.输入0结束
        int positiveCount = 0;
        int negativeCount = 0;
        while (true) {
            System.out.println("请输入数字: (0表示停止输入)");
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            if (i == 0){
                break;
            }else if(i > 0){
                positiveCount++;
            }else{
                negativeCount++;
            }

        }
        System.out.println("正数个数为: " + positiveCount + "个");
        System.out.println("负数个数为: " + negativeCount + "个");


    }
}