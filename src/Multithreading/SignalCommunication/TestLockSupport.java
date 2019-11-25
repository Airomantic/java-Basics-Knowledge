package Multithreading.SignalCommunication;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

/**
 * @program: java基础知识
 * @description: LockSupport 是一种非常灵活的实现线程间阻塞和唤醒的工具，
 *                使用它不用关注是等待线程先进行还是唤醒线程先运行，但是得知道线程的名字
 * @author: jiangzq
 * @create: 2019-11-25 10:19
 **/
public class TestLockSupport {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //实现线程B
        final Thread thread_B = new Thread(()->{
            if (list.size() != 5) {
                LockSupport.park();
            }
            System.out.println("线程B收到通知，开始执行自己的业务...");
        });
        //实现线程B
        Thread thread_A = new Thread(()->{
            for (int i = 1; i < 10; i++) {
                list.add("abc");
                System.out.println("线程A向list中添加一个元素，此时list中的元素个数为：" + list.size());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (list.size() == 5) {
                    LockSupport.unpark(thread_B);
                }
            }
        });
        thread_A.start();
        thread_B.start();
    }
}
