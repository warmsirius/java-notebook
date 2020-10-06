class LogicOperation{
    public static void main(String[] args) {
        //区分& 与 &&
        boolean b1 = true;
        int num1 = 10;
        if(b1 & (num1++ > 0)){
            System.out.println("num1 = " + num1);//11
        }else{
            System.out.println("num1 = " + num1);

        }

        boolean b2 = false;
        int num2 = 10;
        if(b2 | (num2++ > 0)){
            System.out.println("num2 = " + num2);//11
        }else{
            System.out.println("num2 = " + num2);
        }

        boolean b3 = true;
        int num3 = 10;
        if(b1 && (num3++ > 0)){
            System.out.println("num3 = " + num3);//11
        }else{
            System.out.println("num3 = " + num3);
        }

        boolean b4 = true;
        int num4 = 10;
        if(b4 || (num4++ > 0)){
            System.out.println("num4 = " + num4);//10
        }else{
            System.out.println("num4 = " + num4);
        }

    }
}