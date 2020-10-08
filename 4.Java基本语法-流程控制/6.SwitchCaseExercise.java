import java.util.Scanner;

class SwitchCaseExercise {
    public static void main(String[] args) {
        //6.1.1: 首字母大写
        System.out.println("请输入一个字符串:");
        Scanner scan1 = new Scanner(System.in);
        String word = scan1.next();
        char capti = word.charAt(0);
        switch (capti) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
        }

        //6.1.2: 打印成绩合格
        System.out.println("请输入学生的分数:");
        Scanner scan2 = new Scanner(System.in);

        int score = scan2.nextInt();

        switch (score / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不合格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("合格");
                break;
        }

        //6.1.3: 打印月份
        System.out.println("请输入月份:");
        Scanner scan3 = new Scanner(System.in);
        int month = scan3.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入参数有误");
        }

        //6.1.4: 打印是2019年哪天
        Scanner scan4 = new Scanner(System.in);
        System.out.println("请输入2019年月份:");
        int monthNum = scan4.nextInt();
        System.out.println("请输入2019年日期:");
        int dayNum = scan4.nextInt();
        int totalDayNum = 365;
        // 冗余
        /*
        switch (monthNum){
            case 1:
                if(dayNum > 0 && dayNum <= 31){
                    int result = dayNum;
                    System.out.println(monthNum + "月" + dayNum + "日是2019年的第" + result + "天");
                }else{
                    System.out.println("输入有误");
                }
                break;

            case 2:
                if(dayNum > 0 && dayNum <= 28){
                    int result = dayNum + 30;
                    System.out.println(monthNum + "月" + dayNum + "日是2019年的第" + result + "天");
                }else{
                    System.out.println("输入有误");
                }
                break;

            case 3:
                if(dayNum > 0 && dayNum <= 31){
                    int result = dayNum + 30 + 28;
                    System.out.println(monthNum + "月" + dayNum + "日是2019年的第" + result + "天");
                }else{
                    System.out.println("输入有误");
                }
                break;
            case 4:
                if(dayNum > 0 && dayNum <= 30){
                    int result = dayNum + 30 + 28 + 31;
                    System.out.println(monthNum + "月" + dayNum + "日是2019年的第" + result + "天");
                }else{
                    System.out.println("输入有误");
                }
                break;

            case 5:
                if(dayNum > 0 && dayNum <= 31){
                    int result = dayNum + 30 + 28 + 31 + 30;
                    System.out.println(monthNum + "月" + dayNum + "日是2019年的第" + result + "天");
                }else{
                    System.out.println("输入有误");
                }
                break;

            case 6:
                if(dayNum > 0 && dayNum <= 30){
                    int result = dayNum + 30 + 28 + 31 + 30 + 31;
                    System.out.println(monthNum + "月" + dayNum + "日是2019年的第" + result + "天");
                }else{
                    System.out.println("输入有误");
                }
                break;

            case 7:
                if(dayNum > 0 && dayNum <= 31){
                    int result = dayNum + 30 + 28 + 31 + 30 + 31 + 30;
                    System.out.println(monthNum + "月" + dayNum + "日是2019年的第" + result + "天");
                }else{
                    System.out.println("输入有误");
                }
                break;

            case 8:
                if(dayNum > 0 && dayNum <= 31){
                    int result = dayNum + 30 + 28 + 31 + 30 + 31 + 30 + 31;
                    System.out.println(monthNum + "月" + dayNum + "日是2019年的第" + result + "天");
                }else{
                    System.out.println("输入有误");
                }
                break;
            case 9:
                if(dayNum > 0 && dayNum <= 30){
                    int result = dayNum + 30 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                    System.out.println(monthNum + "月" + dayNum + "日是2019年的第" + result + "天");
                }else{
                    System.out.println("输入有误");
                }
                break;

            case 10:
                if(dayNum > 0 && dayNum <= 31){
                    int result = dayNum + 30 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                    System.out.println(monthNum + "月" + dayNum + "日是2019年的第" + result + "天");
                }else{
                    System.out.println("输入有误");
                }
                break;

            case 11:
                if(dayNum > 0 && dayNum <= 30){
                    int result = dayNum + 30 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                    System.out.println(monthNum + "月" + dayNum + "日是2019年的第" + result + "天");
                }else{
                    System.out.println("输入有误");
                }
                break;

            case 12:
                if(dayNum > 0 && dayNum <= 31){
                    int result = dayNum + 30 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                    System.out.println(monthNum + "月" + dayNum + "日是2019年的第" + result + "天");
                }else{
                    System.out.println("输入有误");
                }
                break;


        }

         */

        //倒着写
        int sumDays = 0;
        switch (monthNum) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += dayNum;
        }
        System.out.println(monthNum + "月" + dayNum + "日是2019年的第" + sumDays + "天");

        //6.1.5 判断天数
        Scanner scan5 = new Scanner(System.in);
        System.out.println("请输入年份:");
        int yearNum1 = scan5.nextInt();
        System.out.println("请输入月份:");
        int monthNum1 = scan5.nextInt();
        System.out.println("请输入日期:");
        int dayNum1 = scan5.nextInt();
        int totalDayNum1;
        boolean isLeapYear;

        //判断是否是闰年
        if ((yearNum1 % 4 == 0 && yearNum1 % 100 != 0) || (yearNum1 % 400 == 0)) {
            totalDayNum1 = 366;
            isLeapYear = true;
        } else {
            totalDayNum1 = 365;
            isLeapYear = false;
        }

        int sumDays1 = 0;
        //计算是第几月
        switch (monthNum1) {
            case 12:
                sumDays1 += 30;
            case 11:
                sumDays1 += 31;
            case 10:
                sumDays1 += 30;
            case 9:
                sumDays1 += 31;
            case 8:
                sumDays1 += 31;
            case 7:
                sumDays1 += 30;
            case 6:
                sumDays1 += 31;
            case 5:
                sumDays1 += 30;
            case 4:
                sumDays1 += 31;
            case 3:
                if (isLeapYear) {
                    sumDays1 += 29;
                } else {
                    sumDays1 += 28;
                }
            case 2:
                sumDays1 += 31;
            case 1:
                sumDays1 += dayNum1;
        }

        System.out.println(monthNum1 + "月" + dayNum1 + "日是2019年的第" + sumDays1 + "天");

    }
}