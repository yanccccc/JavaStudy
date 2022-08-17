public class BreakContinue {
    public static void main(String[] args) {
        for(int i = 1;i <= 10;i++){
            if(i % 4 == 0){
                //break;//123
                continue;//123567910
            }
            System.out.println(i);
        }
        System.out.println("******************");
        label:for(int i = 1;i <= 4;i++){
            for(int j = 1;j <= 10;j++){
                if(j % 4 == 0){
                    //break;//默认跳出包裹此关键字最近的一层循环
                    //continue;
                    break label;//结束制定标识的一层for循环
                }
                System.out.println(j);
            }

        }
    }
}
