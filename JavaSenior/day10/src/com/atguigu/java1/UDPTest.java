package com.atguigu.java1;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * UDP的网络编程
 */
public class UDPTest {

    //发送端
    @Test
    public void sender() throws IOException {

        InetAddress inet = InetAddress.getLocalHost();
        byte[] bytes = "UDP发送的导弹".getBytes();
        DatagramSocket ds = new DatagramSocket();
        DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, inet, 9090);
        ds.send(dp);

        ds.close();
        int score[] = new int[9];

    }

    //接收端
    @Test
    public void receiver() throws IOException {
        DatagramSocket ds = new DatagramSocket(9090);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ds.receive(dp);
        String str = new String(dp.getData(),0,dp.getLength());

        System.out.println(str);

        ds.close();

    }
}
