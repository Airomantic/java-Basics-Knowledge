package Multithreading.dispatch;

/**
 * @program: java基础知识
 * @description: 调用setPriority()为线程设置优先级
 *                 优先级用1~10的数字表示，数字越大，优先级越高
 *                 如果没有设置，线程优先级默认为5
 *                 但对于子线程来说，它的优先级是和其父线程优先级相同
 *                 public final void setPriority(int i);
 *
 *                 MAX_PRIORITY
 *                 MIN_PRIORITY
 *                 NORM_PRIORITY   //默认优先级
 *
 *                 result =
 *                      01234567890123456789
 * @author: jiangzq
 * @create: 2019-11-24 11:00
 **/
public class PriorityThread {
    public static void main(String[] args) {
        TestPriority priority_1 = new TestPriority();
        TestPriority priority_2 = new TestPriority();
        priority_1.setPriority(1);
        priority_2.setPriority(10);
        priority_1.start();
        priority_2.start();
    }
}

class TestPriority extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }
}
