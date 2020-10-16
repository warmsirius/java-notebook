import java.util.Scanner;

/**
 Utility工具类:
 将不同的功能封装成方法，就是可以直接通过调用方法使用它的功能，而无需考虑具体的功能实现细节。
*/

public class Utility{
    private static Scanner scanner = new Scanner(System.in);
    /**
     用于界面菜单的选择。该方法读取键盘，如果用户键入1-4中任意字符，则方法返回，返回值为用户键入字符。
     */
    public static char readMenuSelection(){
        char c;
        for(;;){
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if(c!='1' && c!='2' && c!='3' && c!='4'){
                System.out.print("选择错误！请重新输入");
            }else break;
        }
        return c;
    }
    /**
     用于收入和支出金额的输入。该方法从键盘中读取一个不超过4位数长度的整数，并将其作为方法的返回值。
     */
    public static int readNum(){
        int n;
        for(;;){
            String str = readKeyBoard(4);
            try{
                n = Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("数字输入错误，请重新输入:");
            }
        }
        return n;
    }
    /**
     用于收入和支出说明的输入。该方法从键盘中读取一个不超过8位数长度的字符串，并将其作为方法的返回值。
     */
    public static String readString(){
        String str = readKeyBoard(8);
        return str;
    }
    /**
     用于确认选择的输入。该方法从键盘中读取'Y'或'N'，并将其作为方法的返回值。
     */
    public static char readConfirmSelection(){
        char c;
        for(;;){
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if(c=='Y' || c=='N'){
                break;
            }else{
                System.out.print("选择错误！请重新输入");
            }
        }
        return c;
    }

    public static String readKeyBoard(int limit){
        label:for (; ; ){
            String str = scanner.next();
            if(str.length() > limit){
                System.out.println("输入过长，请重新出入：");
                continue label;
            }else{
                return str;
            }
        }
    }

}



