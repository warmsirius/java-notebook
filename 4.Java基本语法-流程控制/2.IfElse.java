class IfElse{
    public static void main(String[] args) {
        //举例1
        int heartBeats = 78;
        if (heartBeats < 60 || heartBeats > 100) {
            System.out.println("需要做进一步检查");
        }
        System.out.println("检查结束");

        //举例2
        int age = 23;
        if (age < 18) {
            System.out.println("还可以多看动画片");
        } else {
            System.out.println("可以开始工作了");
        }

        //举例3
        if (age < 0) {
            System.out.println("输入数据非法");
        } else if (age < 18) {
            System.out.println("青少年时期");
        } else if (age < 35) {
            System.out.println("青壮年时期");
        } else if (age < 60) {
            System.out.println("中年时期");
        } else {
            System.out.println("老年时期");
        }

        boolean x = true;
        boolean y = false;
        short z = 40;
        if ((z++ == 40) && (y = true)) {
            z++;
        }
        if ((x == false) || ++z == 43) {
            z++;
        }
        System.out.println("z = " + z);
    }
}