package interfaces;

/**
 * @program: java基础知识
 * @description: 接口扩展
 *            result : i=10
 *                     j=20
 *                     e=40
 * @author: jiangzq
 * @create: 2019-11-23 16:08
 **/
public class Testinterface_3 {
    public static void main(String[] args) {
        C c = new C();
        c.sayl();
        c.sayJ();
        c.sayE();
    }
}
//声明A，E两个接口
interface A {
    int i = 10;

    public void sayl();
}

interface E {
    int e = 40;

    public void sayE();
}

interface B extends A, E {
    int j = 20;

    public void sayJ();
}
class C implements B{

    @Override
    public void sayE() {
        System.out.println("e="+e);
    }

    @Override
    public void sayJ() {
        System.out.println("j="+j);
    }

    @Override
    public void sayl() {
        System.out.println("i="+i);
    }
}
