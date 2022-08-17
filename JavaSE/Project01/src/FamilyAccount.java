public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true;
        String details = "";
        int balance = 10000;
        while (isFlag){
            System.out.println("----------------家庭收支记账软件-----------------");
            System.out.println("               1 收支明细");
            System.out.println("               2 登记收入");
            System.out.println("               3 登记支出");
            System.out.println("               4 退    出\n");
            System.out.print("              请选择(1~4): ");
            //获取用户选择
            char selection = Utility.readMenuSelection();
            switch (selection){
                case '1':
                    System.out.println("----------------当前收支明细记录----------------");
                    System.out.println("收支        账户金额        收支金额      说明");
                    System.out.println(details);
                    System.out.println("-----------------------------------------------");


                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int revenue = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String infoRevenue = Utility.readString();
                    balance += revenue;
                    details += ("收入        " + balance + "          " + revenue + "          " + infoRevenue + "\n");
                    System.out.println("--------------------登记完成--------------------");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int pay = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String infoPay = Utility.readString();
                    if(balance >= pay){
                        balance -= pay;
                        details += ("支出        " + balance + "           " + pay + "          " + infoPay + "\n");
                    }else {
                        System.out.println("支出超出额度，支付失败");
                    }
                    System.out.println("--------------------登记完成--------------------");
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N):");
                    char exit = Utility.readConfirmSelection();
                    if(exit == 'Y')
                        isFlag = false;
                    //System.out.println("4");
                    break;
            }

        }

    }
}
