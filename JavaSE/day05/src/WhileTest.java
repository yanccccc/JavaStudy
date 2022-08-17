/*
写while循环千万小心不要丢了迭代条件丢了可能导致死循环
for循环和while循环可以相互转化！
 */
public class WhileTest {
    public static void main(String[] args) {
        //遍历100内的所有偶数
        int i = 1;
        while (i <= 100){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        //除了while循环还可以使用
        System.out.println(i);//101
    }
}
