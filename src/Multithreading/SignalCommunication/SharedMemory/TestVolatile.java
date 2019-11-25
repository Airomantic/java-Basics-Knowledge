package Multithreading.SignalCommunication.SharedMemory;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java基础知识
 * @description:
 *       result =
 *         线程A向list中添加一个元素，此时list中的元素个数为：1
 *         线程A向list中添加一个元素，此时list中的元素个数为：2
 *         线程A向list中添加一个元素，此时list中的元素个数为：3
 *         线程A向list中添加一个元素，此时list中的元素个数为：4
 *         线程A向list中添加一个元素，此时list中的元素个数为：5
 *         线程A向list中添加一个元素，此时list中的元素个数为：6
 *         线程B收到通知，开始执行自己的业务...
 *         线程A向list中添加一个元素，此时list中的元素个数为：7
 *         线程A向list中添加一个元素，此时list中的元素个数为：8
 *         线程A向list中添加一个元素，此时list中的元素个数为：9
 *         线程A向list中添加一个元素，此时list中的元素个数为：10
 * @author: jiangzq
 * @create: 2019-11-24 21:17
 **/
public class TestVolatile {
    // 定义一个共享变量来实现通信，它需要是volatile修饰，否则线程不能及时感知
    static volatile boolean notice = false;

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 实现线程A
        Thread thread_A = new Thread(() -> {//(new Runnable(){ run() } ).start();
            for (int i = 1; i <= 10; i++) {
                list.add("abc");
                System.out.println("线程A向list中添加一个元素，此时list中的元素个数为：" + list.size());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (list.size() == 5)   //到第6个结束，开始启动B线程，这是同时运行着A,B线程
                    notice = true;
            }
        });
        // 实现线程B
        Thread thread_B = new Thread(() -> {
            while (true) {
                if (notice) {
                    System.out.println("线程B收到通知，开始执行自己的业务...");
                    break;
                }
            }
        });
        //　需要先启动线程B
        thread_B.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 再启动线程A
        thread_A.start();
    }
}
