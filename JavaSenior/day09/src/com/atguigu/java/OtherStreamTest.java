package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * 其他流的使用
 * 1.标准的输入、输出流
 * 2.打印流
 * 3.数据流
 *
 *
 */
public class OtherStreamTest {

    /*
    1.标准的输入、输出流:属于字节流
    1.1
    System.in:标准的输入流，默认从键盘输入
    System.out:标准的输出流，默认从控制台输出

    1.2
    System类的SetIn(InputStream is)/setOut(PrintStream ps)方式重新指定输入和输出的流向

    1.3 练习：
    从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续
    进行输入操作，直至当输入“e”或者“exit”时，退出程序。

    方法一：使用Scanner实现
    方法二：使用System.in实现  System.in ---> BufferReader的readLine()

     */
    public static void main(String[] args) {

        BufferedReader br = null;
        try {
            System.out.println("请输入一串字符串：");
            InputStreamReader isr = new InputStreamReader(System.in);

            br = new BufferedReader(isr);

            while (true){
                String data = br.readLine();

                if("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)){
                    System.out.println("程序结束");
                    break;
                }
                String upperCase = data.toUpperCase();
                System.out.println(upperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
    打印流：实现将基本数据类型的数据格式转化为字符串输出
    PrintStream和PrintWriter
    提供了一系列重载的print()和println()方法，用于多种数据类型的输出
     */
    @Test
    public void test2(){
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(new File("D:\\Java\\JavaSE\\JavaSenior\\day09\\text.txt"));
// 创建打印输出流,设置为自动刷新模式(写入换行符或字节 '\n' 时都会刷新输出缓冲区)
            ps = new PrintStream(fos, true);
            if (ps != null) {// 把标准输出流(控制台输出)改成文件
                System.setOut(ps);
            }
            for (int i = 0; i <= 255; i++) { // 输出ASCII字符
                System.out.print((char) i);
                if (i % 50 == 0) { // 每50个数据一行
                    System.out.println(); // 换行
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }

    /*
    数据流
    1.DataInputStream 和 DataOutputStream
    2.用于读取或写出基本数据类型或字符串
    将内存中的基本数据类型或字符串写到文件中
     */

    @Test
    public void test3() throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));

        dos.writeUTF("yc");
        dos.flush();
        dos.writeInt(18);
        dos.flush();
        dos.writeBoolean(true);
        dos.flush();

        dos.close();

    }

    //将内存中的文件读出来
    @Test
    public void test4() throws IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));

        String name = dis.readUTF();
        int age = dis.readInt();
        boolean isMale = dis.readBoolean();

        System.out.println("name = " + name + ",age = " + age + ",isMale = " + isMale);

        dis.close();
    }

}
