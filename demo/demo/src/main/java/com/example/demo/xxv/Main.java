package com.example.demo.xxv;

// 测试类
public class Main {
    public static void main(String[] args) {
        VolatileDemo demo = new VolatileDemo();
        new Thread(demo).start();

        while (true) {
            if (demo.isFlag()) {
                System.out.println("this is main");
                break;
            }
        }
    }
}