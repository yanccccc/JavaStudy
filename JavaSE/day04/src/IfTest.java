/*
岳小鹏参加Java考试，他和父亲岳不群达成承诺：
如果：
成绩为100分时，奖励一辆BMW；
成绩为(80，99]时，奖励一台iphone xs max；
当成绩为[60,80]时，奖励一个 iPad；
其它时，什么奖励也没有。
请从键盘输入岳小鹏的期末成绩，并加以判断

 */
import java.util.Scanner;
public class IfTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入岳小鹏的期末成绩：(0-100)");
        int grade = scanner.nextInt();
        if (grade == 100) {
            System.out.println("奖励一台BMW");
        } else if (grade > 80 && grade <= 99) {
            System.out.println("奖励一台iphone xs max");
        } else if (grade >= 60 && grade <= 80) {
            System.out.println("奖励一个 iPad");
        }else {
            System.out.println("什么都没有");
        }
    }
}
