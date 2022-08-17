package com.atguigu.java;

public class ReturnExceptionDemo {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        methodB();
    }

    static void methodA() {
        try {
            System.out.println("���뷽��A");
            throw new RuntimeException("�����쳣");
        }finally {
            System.out.println("��A������finally");
        }
    }

    static void methodB() {
        try {
            System.out.println("���뷽��B");
            return;
        } finally {
            System.out.println("����B������finally");
        }
    }
}
