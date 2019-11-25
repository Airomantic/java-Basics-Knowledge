package interfaces;

/**
 * @program: java基础知识
 * @description: 匿名内部类
 *                 result =8
 * @author: jiangzq
 * @create: 2019-11-23 16:43
 **/
public class TestNonameinner {
    public static void main(String[] args) {
        B_noName b = new B_noName();
        b.test();
    }
}

interface A_noName {
    public void fun1();
}

class B_noName {
    int i = 10;

    public void get(A_noName a) {
        a.fun1();
    }

    public void test() {
        this.get(new A_noName() {
            @Override
            public void fun1() {
                System.out.println(i);
            }
        });
    }
}
