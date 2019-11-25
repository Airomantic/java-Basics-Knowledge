package Multithreading;

/**
 * @program: java基础知识
 * @description:
 *        result =
 *        线程正在运行~~~
 *        线程正在运行~~~
 *        线程正在运行~~~
 *        线程正在运行~~~
 *        线程正在运行~~~
 *        TestThread_1正在运行...
 *        TestThread_1正在运行...
 *        TestThread_1正在运行...
 *        TestThread_1正在运行...
 *        TestThread_1正在运行...
 * @author: jiangzq
 * @create: 2019-11-24 09:02
 **/
public class ThreadDemo_1 {
    public static void main(String[] args) {
        new TestThread_1().start();
        for (int i = 0; i < 5; i++) {
            System.out.println("线程正在运行~~~");
        }
    }
}

class TestThread_1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("TestThread_1正在运行...");
        }
    }
}
