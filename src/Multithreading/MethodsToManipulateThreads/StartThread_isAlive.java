package Multithreading.MethodsToManipulateThreads;

/**
 * @program: java基础知识
 * @description:
 * @author: jiangzq
 * @create: 2019-11-24 10:22
 **/
public class StartThread_isAlive extends Thread{
    public static void main(String[] args) {
        StartThread_isAlive startThread_isAlive = new StartThread_isAlive();
        startThread_isAlive.setName("test thread");
        System.out.println("调用start方法之前，startThread_isAlive.isAlive()="+startThread_isAlive.isAlive());
        startThread_isAlive.start();

        System.out.println("调用start方法之后，startThread_isAlive.isAlive()="+startThread_isAlive.isAlive());
        for (int i = 0; i < 3; i++) {
            startThread_isAlive.printMsg();
        }
        System.out.println("调用start结束之后，startThread_isAlive.isAlive()="+startThread_isAlive.isAlive());
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            printMsg();
        }
    }

    private void printMsg() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name=" + name);
    }
}
