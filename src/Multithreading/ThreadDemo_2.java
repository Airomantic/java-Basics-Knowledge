package Multithreading;

/**
 * @program: java基础知识
 * @description:  通过实现Runnable接口创建多线程
 *        result =
 *            线程正在运行~~~
 *            线程正在运行~~~
 *            线程正在运行~~~
 *            线程正在运行~~~
 *            线程正在运行~~~
 *            TestThread_2正在运行...
 *            TestThread_2正在运行...
 *            TestThread_2正在运行...
 *            TestThread_2正在运行...
 *            TestThread_2正在运行...
 * @author: jiangzq
 * @create: 2019-11-24 09:17
 **/
public class ThreadDemo_2 {
    public static void main(String[] args) {
        TestThread_2 testThread_2 = new TestThread_2();
        new Thread(testThread_2).start();
        for (int i = 0; i < 5; i++) {
            System.out.println("线程正在运行~~~");
        }
    }
}

class TestThread_2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("TestThread_2正在运行...");
        }
    }
}