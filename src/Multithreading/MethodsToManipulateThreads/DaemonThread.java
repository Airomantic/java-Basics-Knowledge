package Multithreading.MethodsToManipulateThreads;

/**
 * @program: java基础知识 后台线程
 * @description: 对于Java程序来说，只要有一个前台线程在运行，这个进程就不会结束
 *                                  如果一个进程中只有后台线程，这个进程就会结束
 *                                  之前写的类都是前台线程
 *                                  如果某个线程在启动之前调用了setDaemon(true)，则这个线程就变成了后台线程
 *                  result =
 *                       Process finished with exit code 0
 *                          为空
 * @author: jiangzq
 * @create: 2019-11-24 10:40
 **/
public class DaemonThread {
    public static void main(String[] args) {
        TestDaemon daemon = new TestDaemon();
        Thread thread = new Thread(daemon);
        thread.setDaemon(true);
        thread.start();
    }
}

class TestDaemon implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println(
                    "无限循环中"+
                    Thread.currentThread().getName()
                    + "is running..."
            );
        }
    }
}
