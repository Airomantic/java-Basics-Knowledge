package Multithreading.dispatch;

/**
 * @program: java基础知识 只让步给高优先级或同等优先级的线程
 * @description: yield 让步，屈服
 *                调用yield()使正在执行的线程重新排队，将CPU让给排在后面的线程，此时线程转为就绪态
 *          result =
 *             0 0 1 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9
 * @author: jiangzq
 * @create: 2019-11-24 11:44
 **/
public class YieldThread {
    public static void main(String[] args) {
        TestYield testYield_1 = new TestYield();
        TestYield testYield_2 = new TestYield();
        testYield_1.start();
        testYield_2.start();
    }
}

class TestYield extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
            yield(); //让当前线程让步，交替打印
        }
    }
}

