import java.util.Scanner;

class ScannerTest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入您的名字:");
        String name = scan.next();
        System.out.println(name);

        System.out.print("请输入您的年龄:");
        int num = scan.nextInt();
        System.out.println(num);

        System.out.print("请输入您的体重:");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.print("您是否单身?(true/false)");
        boolean isSingle = scan.nextBoolean();
        System.out.println(isSingle);

        //非要获取char类型的值
        System.out.print("您的性别?(男/女)");
        String gender = scan.next();
        char genderChar = gender.charAt(0);//获取索引为0位置上的字符
        System.out.println(genderChar);

    }
}