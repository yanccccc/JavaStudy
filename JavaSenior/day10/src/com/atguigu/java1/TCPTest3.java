package com.atguigu.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 例题3：从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。并关闭相应的连接。
 */
public class TCPTest3 {

    @Test
    public void client() throws IOException {

        InetAddress inet = InetAddress.getByName("127.0.0.1");
        Socket socket = new Socket(inet,8877);

        OutputStream os = socket.getOutputStream();

        FileInputStream fis = new FileInputStream(new File("liuliang.jpg"));

        byte[] buffer = new byte[1024];
        int len;

        while ((len = fis.read(buffer)) != -1){
            os.write(buffer,0,len);
        }
        socket.shutdownOutput();

        //接受来自于服务器的数据，并显示到控制台上
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer1 = new byte[10];
        int len1;
        while ((len1 = is.read(buffer1)) != -1){
            baos.write(buffer1,0,len1);
        }
        System.out.println(baos);


//        baos.close();
        fis.close();
        os.close();
        socket.close();

    }



    @Test
    public void Server() throws IOException {
        ServerSocket ss = new ServerSocket(8877);
        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();

        FileOutputStream fos = new FileOutputStream(new File("liuliang2.jpg"));

        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1){
            fos.write(buffer,0,len);
        }


        System.out.println("图片传输成功");

        //服务器给客户端反馈,传输字节流
        OutputStream os = socket.getOutputStream();
        os.write("你好，照片已收到，谢谢".getBytes());

        os.close();
        fos.close();
        is.close();
        socket.close();
        ss.close();
    }
}
