package Multithreading.dispatch;

/**
 * @program: java基础知识
 * @description:
 *             result =
 *                0123456789 每隔一秒逐个打印一个数字
 * @author: jiangzq
 * @create: 2019-11-24 11:26
 **/
public class SleepThread {
    public static void main(String[] args) {
        TestSleep testSleep = new TestSleep();
        testSleep.start();
    }
}

class TestSleep extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
