/*
嵌套循环的使用
 */
public class ForForTest {
    public static void main(String[] args) {

        /*
        ******
        ******
        ******
        ******
         */
        for(int j = 1;j <= 4;j++){
            for(int i = 1;i <= 6;i++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("===================");
        /*
         *
         **
         ***
         ****
         *****
         */
        for(int i = 1;i <= 5;i++){
            for(int j = 1;j <= i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("===================");
        /*
         ****
         ***
         **
         *
         */
        for(int i = 1;i <= 4;i++){
            for(int j = 1;j <= 5-i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
         */
        System.out.println("===================");
        for(int i = 1;i <= 4;i++){
            for(int j = 1;j <= i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i = 1;i <= 4;i++){
            for(int j = 1;j <= 5-i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("===================");
        /*
             *
            * *
           * * *
          * * * *
         * * * * *
          * * * *
           * * *
            * *
             *
         */
        //上半部分
        for(int i = 1;i <= 5;i++){
            for(int j = 1;j <= 5-i;j++){
                System.out.print(' ');
            }
            for(int m = 1;m <= i;m++){
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }
        //下半部分
        for(int i = 1;i <= 4;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(' ');
            }
            for(int m = 1;m <= 5-i;m++){
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }

    }
}
