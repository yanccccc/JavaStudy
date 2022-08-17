/*
变量的使用
1. java定义变量的格式：数据类型 变量名 = 变量值;

2. 说明：
    (1)变量必须先声明后使用
    (2)变量都定义在其作用域内。在作用域内有效，除了作用域就无效
    (3)同一个作用域内不可以声明两个同名的变量，不是会覆盖而是直接报错

3. Java定义的数据类型
    基本数据类型：
        整形：byte\short\int\long
        浮点型：float\double
        字符型:char
        布尔型：boolean

     引用数据类型：
        类(class)
        接口(interface)
        数组(array)
*/

public class VariableTest {
    public static void main(String[] args) {
        int myAge = 12;
        System.out.println(myAge);

//         未被赋值会报错
//         int myNumber;
//         System.out.println(myNumber);
        // 同一个作用域内不能定义同名的变量
        // int myAge = 22;

        // byte范围：-128 ~ 127
        byte b1 = 12;
        // long形变量必须以“l“或"L"结尾
        long l1 = 12546L;

        //定义char型变量，通常使用一对单引号''
        char c1 = 'a';
        char c2 = '1';
        char c3 = '中';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //转义字符
        char c4 = '\n';  //换行符
        char c5 = '\t';  //制表符

    }

    public void method(){

        int myClass = 1;
    }
}
