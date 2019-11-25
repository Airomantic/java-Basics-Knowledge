package abstractClass;

/**
 * @program: java基础知识  Java可以创建抽象类专门用来当做父类，
 *                          类似于“模板”，其目的是要设计者能够依据它的格式来修改并创建新的类
 *
 * @description: 抽象类的子类必须覆盖所有的抽象方法
 *                 不能实例化，即不能new关键字去产生对象
 * @author: jiangzq
 * @create: 2019-11-23 10:43
 **/
public abstract class Testabstract_1 {
    public abstract void fun1();

    public abstract void fun2();
}

class abstactDemo extends Testabstract_1 {

    @Override
    public void fun1() {

    }

    @Override
    public void fun2() {

    }
}
