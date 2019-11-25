package Multithreading.MethodsToManipulateThreads;

/**
 * @program: java基础知识
 * @description:
 *          result =
 *                 name=main
 *                 name=main
 *                 name=main
 *                 name=main
 *                 name=main
 *                 name=test thread
 *                 name=test thread
 *                 name=test thread
 *                 name=test thread
 *                 name=test thread
 * @author: jiangzq
 * @create: 2019-11-24 10:12
 **/
public class SetNameThread extends Thread{
    public static void main(String[] args) {
        SetNameThread setNameThread = new SetNameThread();
        setNameThread.setName("test thread"); //这里是test thread
        setNameThread.start();
        for (int i = 0; i < 5; i++) {
            setNameThread.printMsg();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            printMsg();
        }
    }

    private void printMsg() {
        Thread thread = Thread.currentThread();//这里都是main
        String name = thread.getName();
        System.out.println("name=" + name);
    }
}

