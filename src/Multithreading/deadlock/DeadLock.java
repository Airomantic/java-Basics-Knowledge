package Multithreading.deadlock;

/**
 * @program: java基础知识 类似于哲学家就餐问题 ---避免死锁
 * @description:
 *    result =
 *        A拿起了筷子1,等待 筷子2
 *        B拿起了 筷子2,等待筷子1
 *        重新运行后，又不同
 * @author: jiangzq
 * @create: 2019-11-24 18:29
 **/
public class DeadLock {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new WatchThread().start();
    }

    static String chopsticks_1 = "筷子1", chopsticks_2 = "筷子2";

    static class A extends Thread {
        public void run() {
            synchronized (chopsticks_1) {
                System.out.println("A拿起了" + chopsticks_1 + ",等待 " + chopsticks_2);
                try {
                    Thread.sleep(100);//等待0.1秒
                } catch (InterruptedException e) {
                    synchronized (chopsticks_2) {
                        System.out.println("A又拿起了 "+chopsticks_2);
                    }
                }
            }
        }
    }

    static class B extends Thread {
        public void run() {
            synchronized (chopsticks_2) {
                System.out.println("B拿起了 " + chopsticks_2 + ",等待" + chopsticks_1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    synchronized (chopsticks_1) {
                        System.out.println("B又拿起了 "+chopsticks_1);
                    }
                }
            }
        }
    }

    static class WatchThread extends Thread {
        /*public WatchThread() {
            this.setWatchThread(true);
        }*/

        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("守护线程：线程正在运行...");
                }
            }
        }
    }
}
