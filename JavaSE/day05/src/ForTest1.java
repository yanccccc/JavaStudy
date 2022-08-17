/*
输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数
字立方和等于其本身。
例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
 */

public class ForTest1 {
    public static void main(String[] args) {
        for(int i = 100;i < 1000; i ++){
            //百位
            int bai = i / 100;
            //十位
            int shi = i % 100 / 10;
            //个位
            int ge = i % 10;
            if(i == Math.pow(bai,3) + Math.pow(shi,3) + Math.pow(ge,3)){
                System.out.println("水仙花数为：" + i);
            }
        }
    }
}
