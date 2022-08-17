/*
swtich-case

swtich结构中的表达式，只能是以下6种数据类型之一：
    byte、short、int、char、枚举类型、String类型
case结构只能声明常量。不能声明范围

如果swtich-case的多个语句相同可以合并
 */

public class SwitchCaseTest {
    public static void main(String[] args) {
        //对成绩大于60分的输出合格，对低于60分的输出不合格
        int score = 78;
        switch (score/60){
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
        }


    }
}
