package interfaces;

/**
 * @program: java基础知识 class 类名称 implements 接口A,接口B {
 *                          类主体
 *                          }
 *
 * @description: 接口里的方法必须声明为abstract
 *                也就是说
 *                接口不能像抽象类那样保有一般的方法，必须全部是抽象方法，否则会出错
 * @author: jiangzq
 * @create: 2019-11-23 11:27
 **/
public class Testinterface_2 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.talk());
    }
}

interface Person {
    String name = "张三";

    public abstract String talk();
}

class Student implements Person {

    @Override
    public String talk() {
        return "姓名："+this.name;
    }
}
