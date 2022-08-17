/*
if-else


 */

public class IFTest {
    public static void main(String[] args) {
        int heartBeats = 79;
        if(heartBeats < 60 || heartBeats > 100){
            System.out.println("需要做进一步检查");
        }
        System.out.println("检查结束");

        int age = 23;
        if(age < 18){
            System.out.println("未成年");
        }else{
            System.out.println("成年了");
        }
    }
}
