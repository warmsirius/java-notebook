import java.util.Scanner;

class FamilyAccount {
    public static void main(String[] args) {
        int balance = 200;
        boolean isFlag = true;
        String accountDetail = "收支\t账户金额\t收支金额\t说   明\n";

        while (isFlag) {
            System.out.println("------------家庭收支记账软件-------------");
            System.out.println("            1.收支明细");
            System.out.println("            2.登记收入");
            System.out.println("            3.登记支出");
            System.out.println("            4.退   出\n");
            System.out.println("            请选择(1-4):");

            // 获取用户的选择: 1-4
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("1.收支明细");
                    System.out.println("------------当前收入明细记录-------------");
                    System.out.println(accountDetail);
                    System.out.println("---------------------------------------");
                    break;
                case '2':
                    System.out.println("2.登记收入");
                    System.out.println("请输入收入金额:");
                    int income = Utility.readNum();
                    balance += income;
                    System.out.println("请输入收入来源:");
                    String incomeReason = Utility.readString();
                    accountDetail += "收入\t" + balance + "\t\t" + income + "\t\t" + incomeReason + "\n";
                    System.out.println("------------登记完成-------------");

                    break;
                case '3':
                    System.out.println("3.登记支出");
                    System.out.println("请输入支出金额:");
                    int outcome = Utility.readNum();

                    if (balance >= outcome) {
                        balance -= outcome;
                        System.out.println("请输入支出理由:");
                        String outcomeReason = Utility.readString();
                        accountDetail += "支出\t" + balance + "\t\t" + outcome + "\t\t" + outcomeReason + "\n";
                    } else {
                        System.out.println("支出超出账户额度，支付失败!");
                    }

                    break;
                case '4':
                    System.out.println("是否要退出(Y/N)?");
                    char isExit = Utility.readConfirmSelection();
                    isFlag = (isExit == 'Y') ? false : true;

                    break;
            }
        }
    }
}