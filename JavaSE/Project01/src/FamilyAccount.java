public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true;
        String details = "";
        int balance = 10000;
        while (isFlag){
            System.out.println("----------------��ͥ��֧�������-----------------");
            System.out.println("               1 ��֧��ϸ");
            System.out.println("               2 �Ǽ�����");
            System.out.println("               3 �Ǽ�֧��");
            System.out.println("               4 ��    ��\n");
            System.out.print("              ��ѡ��(1~4): ");
            //��ȡ�û�ѡ��
            char selection = Utility.readMenuSelection();
            switch (selection){
                case '1':
                    System.out.println("----------------��ǰ��֧��ϸ��¼----------------");
                    System.out.println("��֧        �˻����        ��֧���      ˵��");
                    System.out.println(details);
                    System.out.println("-----------------------------------------------");


                    break;
                case '2':
                    System.out.print("���������");
                    int revenue = Utility.readNumber();
                    System.out.print("��������˵����");
                    String infoRevenue = Utility.readString();
                    balance += revenue;
                    details += ("����        " + balance + "          " + revenue + "          " + infoRevenue + "\n");
                    System.out.println("--------------------�Ǽ����--------------------");
                    break;
                case '3':
                    System.out.print("����֧����");
                    int pay = Utility.readNumber();
                    System.out.print("����֧��˵����");
                    String infoPay = Utility.readString();
                    if(balance >= pay){
                        balance -= pay;
                        details += ("֧��        " + balance + "           " + pay + "          " + infoPay + "\n");
                    }else {
                        System.out.println("֧��������ȣ�֧��ʧ��");
                    }
                    System.out.println("--------------------�Ǽ����--------------------");
                    break;
                case '4':
                    System.out.print("ȷ���Ƿ��˳�(Y/N):");
                    char exit = Utility.readConfirmSelection();
                    if(exit == 'Y')
                        isFlag = false;
                    //System.out.println("4");
                    break;
            }

        }

    }
}
