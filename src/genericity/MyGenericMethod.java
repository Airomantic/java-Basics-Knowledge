package genericity;

/**
 * @program: java基础知识 泛型方法
 * @description:
 *       result =
 *        lo
 *        ve
 *        1
 *        2
 * @author: jiangzq
 * @create: 2019-11-25 19:09
 **/
public class MyGenericMethod {
    public <M> void print(M[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }

    public static void main(String[] args) {
        String[] s = new String[]{"lo", "ve"};
        MyGenericMethod method_1 = new MyGenericMethod();
        method_1.print(s);
        Integer[] n = new Integer[]{1, 2};
        MyGenericMethod method_2 = new MyGenericMethod();
        method_2.print(n);
    }
}

class MyMethod_1 {
    public void print(int[] t){
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }

    public static void main(String[] args) {
        int[] s = new int[]{1, 2};
        MyMethod_1 myMethod_1 = new MyMethod_1();
        myMethod_1.print(s);
    }
}
class MyMethod_2{
    public void print(String[] str){
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

    public static void main(String[] args) {
        String[] s = new String[]{"lo", "ve"};
        MyMethod_2 myMethod_2 = new MyMethod_2();
        myMethod_2.print(s);
    }
}

