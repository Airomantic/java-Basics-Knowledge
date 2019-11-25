package Multithreading.synchronize;

/**
 * @program: java基础知识
 * @description:
 *       result =
 *            00000000000000000000
 * @author: jiangzq
 * @create: 2019-11-24 17:55
 **/
public class TestSynchronized {
    public static void main(String[] args) {
        SynchronizedThread synchronizedThread = new SynchronizedThread();
        Thread thread_1 = new Thread(synchronizedThread);
        Thread thread_2 = new Thread(synchronizedThread);
        thread_1.start();
        thread_2.start();
    }
}

class SynchronizedThread implements Runnable {
    private int n = 0;
    @Override
    public void run() {
        test();
    }

    private void test() {
        synchronized (SynchronizedThread.class) {
            for (int i = 0; i < 10; i++) {
                n++;
                n--;
                Thread.yield();
                System.out.print(n);
            }
        }
    }
}
