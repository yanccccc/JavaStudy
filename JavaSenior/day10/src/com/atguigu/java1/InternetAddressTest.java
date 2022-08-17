package com.atguigu.java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 一、网络编程中有两个主要的问题：
 * 如何准确地定位网络上一台或多台主机；定位主机上的特定的应用
 * 找到主机后如何可靠高效地进行数据传输
 *
 * 二、网络编程中的两个要素：
 * 1.对应问题一：IP和端口号
 * 2.对应问题二：提供网络通信协议：TCP/IP模型
 *
 * 三、通信要素一：IP和端口号
 *
 * 1.IP：唯一的标识：Internet上的计算机
 * 2.在java中使用InetAddress代表IP
 * 3.IP分类：IPv4和IPv6
 * 4.域名:www.baidu.com
 * 5.本机回路地址：127.0.0.1 对应这：localhost
 *
 * 6.如何实例化InetAddreess两个方法：getByName(String host)、getLocalHost()
 *                  常用的两个方法：getHostName()、getHostAddress()
 *
 * 7.端口号：端口号标识正在计算机上运行的进程
 *       要求：不同的进程有不同的端口号
 *       范围：被规定为一个 16 位的整数 0~65535。
 *
 * 8.端口号与IP地址的组合得出一个网络套接字：Socket。
 */
public class InternetAddressTest {

    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");

            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inet2);

            InetAddress inet3 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet3);

            //获取本机ip
            InetAddress inet4 = InetAddress.getLocalHost();
            System.out.println(inet4);

            //getHostName()
            System.out.println(inet2.getHostName());

            //getHostAddress()
            System.out.println(inet2.getHostAddress());
        } catch (UnknownHostException e) {

            e.printStackTrace();
        }

    }
}
