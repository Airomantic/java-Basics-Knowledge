package Multithreading.SignalCommunication;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java基础知识
 * @description: Object类提供了线程间通信的方法：wait()、notify()、notifyaAl()，它们是多线程通信的基础
 *             注意： wait和 notify必须配合synchronized使用
 *             result =
 *                线程A向list中添加一个元素，此时list中元素的个数为：1
 *                线程A向list中添加一个元素，此时list中元素的个数为：2
 *                线程A向list中添加一个元素，此时list中元素的个数为：3
 *                线程A向list中添加一个元素，此时list中元素的个数为：4
 *                线程A向list中添加一个元素，此时list中元素的个数为：5
 *                线程A向list中添加一个元素，此时list中元素的个数为：6
 *                线程A向list中添加一个元素，此时list中元素的个数为：7
 *                线程A向list中添加一个元素，此时list中元素的个数为：8
 *                线程A向list中添加一个元素，此时list中元素的个数为：9
 *                线程B收到通知
 * @author: jiangzq
 * @create: 2019-11-25 10:03
 **/
public class TestBasics {
    public static void main(String[] args) {
        // 定义一个锁对象
        Object lock = new Object();
        List<String> list = new ArrayList<>();
        //实现线程A
        Thread thread_A = new Thread(() ->{
            synchronized (lock) {
                for (int i = 1; i < 10; i++) {
                    list.add("abc"); //添加的内容
                    System.out.println("线程A向list中添加一个元素，此时list中元素的个数为："+list.size());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (list.size() == 5) {
                        lock.notify();//唤醒B线程 ,notify方法不释放锁
                    }
                }
            }
        });
        //实现线程B
        Thread thread_B=new Thread(()->{
            while (true) {
                synchronized (lock) {
                    if (list.size() != 5) {
                        try {
                            lock.wait(); //wait方法释放锁
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("线程B收到通知,开始自己的业务.....");
                }
            }
        });
        //需要先启动线程B
        thread_B.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //再启动线程A
        thread_A.start();
    }
}
