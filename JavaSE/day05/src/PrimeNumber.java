/*
100之内质数的输出
 */

public class PrimeNumber {
    public static void main(String[] args) {
        /* 方法一直接法
        for(int i = 2;i <= 100;i++){
            boolean isFlag = true;
            for(int j = 2;j < i;j++){
                if(i % j == 0){
                    isFlag = false;
                }
            }
            if(isFlag){
                System.out.println("质数为：" + i);
            }
        }
        */

        /* 方法二
        long strat = System.currentTimeMillis();
        int count = 0;
        for(int i = 2;i <= 100000;i++){
            boolean isFlag = true;
            for(int j = 2;j <= Math.sqrt(i);j++){
                if(i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                //System.out.println("质数为：" + i);
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为:" + count);
        System.out.println("所花费的时间为:" + (end - strat));
         */



    }
}
