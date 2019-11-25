package interfaces;

/**
 * @program: java基础知识
 * @description: “构造方法参数”必须是空的，因为接口是没有构造方法的
 * @author: jiangzq
 * @create: 2019-11-23 16:55
 **/
public class InterfaceAnonymousInnerClass {
    public static void main(String[] args) {
        InterfaceInner inner = new InterfaceInner() {
            @Override
            public void method() {
                System.out.println("执行method方法");
            }
        };
        inner.method(); //result = 执行method方法
    }
}

interface InterfaceInner {
    public void method();

    //通过抽象类使用匿名类
    /*public void method(){
        System.out.println("内部类Inner方法method");
    }*/
}