package genericity;

/**
 * @program: java基础知识 泛型类
 * @description:
 *          泛型类 result =
 *                        love
 *                        2
 * @author: jiangzq
 * @create: 2019-11-25 16:41
 **/
public class MyGeneric<T> {
    private T s;

    public T getT() {
        return s;
    }

    public void setT(T s) {
        this.s = s;
    }

    public static void main(String[] args) {
        MyGeneric<String> myGeneric_1 = new MyGeneric<>();
        myGeneric_1.setT("love");
        System.out.println(myGeneric_1.getT());
        MyGeneric<Integer> myGeneric_2 = new MyGeneric<>();
        myGeneric_2.setT(new Integer(2));
        System.out.println(myGeneric_2.getT());
    }
}

class Test_1 { //result = love
    private String s;

    public String getT() {
        return s;
    }

    public void setT(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        Test_1 test_1 = new Test_1();
        test_1.setT("love");
        System.out.println(test_1.getT());
    }
}

class Test_2 { //result = 2
    private Integer s;

    public Integer getT() {
        return s;
    }

    public void setT(Integer s) {
        this.s = s;
    }

    public static void main(String[] args) {
        Test_2 test_2 = new Test_2();
        test_2.setT(new Integer(2));
        System.out.println(test_2.getT());
    }
}