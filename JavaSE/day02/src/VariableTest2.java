/*

强制类型转换：自动类型提升运算的逆运算
1. 需要使用强转符：()
2. 强制类型转换，可能会导致精度损失


 */

public class VariableTest2 {
    public static void main(String[] args) {
        double d1 = 12.3;

        int i1 = (int)d1;  // 只取整数部分
        System.out.println(i1);

        int i2 = 128;
        byte b = (byte) i2;
        System.out.println(b);
    }
}
