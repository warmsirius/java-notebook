class SwitchCaseTest{
    public static void main(String[] args) {
        int num = 2;
        switch (num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("other");
        }

        //****错误示例: switch表达式值为布尔类型，编译报错
        /*
        int isBeauty = true;
        switch (isBeauty){
            case true:
                System.out.println("Beaty");
                break;
            default:
                System.out.println("Plain");
        }
         */


        String season = "summer";
        switch (season){
            case "spring":
                System.out.println("春暖花开");
                break;

            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "winnter":
                System.out.println("白雪皑皑");
                break;
            default:
                System.out.println("输入季节有误");
        }
    }
}