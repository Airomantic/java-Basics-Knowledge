package Multithreading.MethodsToManipulateThreads;

/**
 * @program: java基础知识
 * @description: 获取主线程名
 *           result =
 *                name=main
 *                name=main
 *                name=main
 *                name=main
 *                name=main
 *                name=Thread-0
 *                name=Thread-0
 *                name=Thread-0
 *                name=Thread-0
 *                name=Thread-0
 * @author: jiangzq
 * @create: 2019-11-24 10:01
 **/
public class GetNameThread extends Thread{
    public static void main(String[] args) {
        GetNameThread getNameThread = new GetNameThread();
        getNameThread.start();
        for (int i = 0; i < 5; i++) {
            getNameThread.printMsg();
        }
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            printMsg();
        }
    }

    private void printMsg() {
        Thread thread = Thread.currentThread();//获取运行次代码的线程的引用
        String name = thread.getName();
        System.out.println("name=" + name);
    }
}
