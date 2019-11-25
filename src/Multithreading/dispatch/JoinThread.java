package Multithreading.dispatch;

/**
 * @program: java基础知识 线程的等待方法
 * @description: 对于正在执行的线程，可以调用join()等待其结束，然后再执行其他程序
 *         result =
 *              01234567890123456789
 * @author: jiangzq
 * @create: 2019-11-24 11:57
 **/
public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin_1 = new TestJoin();
        TestJoin testJoin_2 = new TestJoin();
        testJoin_1.start();
        testJoin_1.join();//需抛出InterruptedException
        testJoin_2.start();
    }
}

class TestJoin extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }
}

