/*
逻辑运算符
& &&(短路与) | ||(短路或) ! ^

1.逻辑运算符操作的都是boolean类型的变量

 */

public class LogicTest {
    public static void main(String[] args) {
        //区分& 与 &&
        //相同点：& 与 &&运算结果相同
        //不同点：当符号左边是false时，&继续执行右边的运算，&&(短路与)不执行右边的运算
        //开发中推荐使用短路与(&&)
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if(b1 & (num1++ > 0)){
            System.out.println("我现在在北京");
        }else {
            System.out.println("我现在在南京");
        }
        System.out.println("num1 = " + num1);

        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if(b2 && (num2++ > 0)){
            System.out.println("我现在在北京");
        }else {
            System.out.println("我现在在南京");
        }
        System.out.println("num2 = " + num2);
        //区分| 与 ||
        //相同点：| 与 ||运算结果相同
        //不同点：当符号左边是TRUE时，|继续执行右边的运算，||(短路或)不执行右边的运算

    }
}
