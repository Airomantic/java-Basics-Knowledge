package Multithreading.synchronize;

/**
 * @program: java基础知识 多线程竞争共享资源
 * @description:
 *               result =
 *                   00000000000000000000
 *  由于同时启动了两个线程，变量n对这两个线程是共享的
 *  在不同时刻，每个线程都可能在对变量n执行自加或自减操作
 *      n++;//执行线程thread_1的代码
 *      System.out.print(n);//打印n的值  //执行线程thread_2的代码
 *      此时，打印的结果值都是1
 *  要解决此类问题，需使用synchronized关键字对共享资源实行同步访问
 *  被synchronized关键字修饰的代码，在有线程开始执行时首先对其进行锁定，其他线程此时不能执行该段代码
 *  直到当前线程执行完解除锁定
 * @author: jiangzq
 * @create: 2019-11-24 17:26
 **/
public class TestNoSynchronized {
    public static void main(String[] args) {
        NoSynchronizedThread noSynchronized = new NoSynchronizedThread();
        Thread thread_1 = new Thread(noSynchronized);
        Thread thread_2 = new Thread(noSynchronized);
        thread_1.start();
        thread_2.start();
    }
}

class NoSynchronizedThread implements Runnable {

    private int n = 0;
    @Override
    public void run() {
        test();
    }

    private void test() {
        for (int i = 0; i < 10; i++) {
            n++;
            n--;
            Thread.yield();
            System.out.print(n);
        }
    }
}
