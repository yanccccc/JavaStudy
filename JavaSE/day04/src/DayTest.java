public class DayTest {
    public static void main(String[] args) {
        /*
        第一题
        boolean x = true;
        boolean y = false;
        short z = 40;
        if ((z++ == 40) && (y = true)) {
            z++;//42
        }
        if ((x = false) || (++z == 43)) {
            z++;//44
        }
        System.out.println("z = " + z);

         */

        /*
        第二题
        int n1 = 12;
        int n2 = 54;
        int n3 = -5;
        int max1 = (n1 > n2)? n1 : n2;
        int max2 = (max1 > n2)? max1 : n2;
        System.out.println("最大值是：" + max2);

         */

        /*
        第三题
        double d1 = 12.5;
        double d2 = 5.2;
        if(d1 > 10.0 && d2 < 20.0){
            System.out.println(d1 + d2);
        }else {
            System.out.println(d1 * d2);
        }
         */

        /*
        第五题
        int m1 = 12;
        int m2 = 5;
        int temp;
        System.out.println("交换前m1 = " + m1 + ",m2 = " + m2);
        temp = m1;
        m1 = m2;
        m2 = temp;
        System.out.println("交换后m1 = " + m1 + ",m2 = " + m2);
         */

        // 0~255的十进制转十六进制
        //60的二进制位0011 1100
        int i1 = 60;
        //15的二进制是1111 相与后可以得到原数的后四位二进制数(1100)
        int i2 = i1 & 15;
        //如果二进制后4位大于9则要用ABCD表示
        String s1 = (i2 > 9)? (char) (i2 - 10 + 'A') + "" :i2 + "";
        //取二进制的前4位数(0011)
        int i3 = i1 >>> 4;
        //与上述步骤相同
        int i4 = i3 & 15;
        //如果二进制后4位大于9则要用ABCD表示
        String s2 = (i4 > 9)? (char) (i4 - 10 + 'A') + "" :i4 + "";

        System.out.println(i1 + "的十六进制为" + s2 + s1);

    }
}

