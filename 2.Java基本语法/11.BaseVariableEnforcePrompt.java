class BaseVariableEnforcePrompt{
    public static void main(String[] args) {
        // double --> int，存在精度损失
        double d1 = 12.3;
        int i1 = (int)d1;//截断操作
        System.out.println(i1);

        // long --> short，不存在精度损失
        long l1 = 12L;
        short s1 = (short)l1;
        System.out.println(s1);

        // int(超过byte类型了) --> byte，精度损失
        int i2 = 128;
        byte b1 = (byte)i2;
        System.out.println(b1);//-128


    }
}