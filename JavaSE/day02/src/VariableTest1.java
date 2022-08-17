/*
基本数据类型之间的运算：

前提：这里讨论的基本数据类型不包含布尔型

自动类型转换：
    当容量小的数据类型变量与容量大的数据类型做运算，结果自动提升为容量大的数据类型
    byte、char、short --> int --> long --> float --> double
    特别的：当byte、char、short类型的变量做运算时，结果都为int型


说明：此时容量大小指的是表示数的范围大小，不是占的内存的大小
 */

public class VariableTest1 {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 12;
        int i2 = b1 + i1;
        System.out.println(i2);

        float f = b1 + i1;
        System.out.println(f);

        //***************************
        char c1 = 'a';
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        short s2 = 10;
        // short s3 = s2 + c1;  编译不通过



    }
}
