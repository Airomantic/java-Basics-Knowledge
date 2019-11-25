package abstractClass;

/**
 * @program: java基础知识
 * @description: 抽象方法留给子类去实现
 *                 result : 姓名：张三
 * 构造方法、私有方法、静态方法和final类型的方法不能声明为抽象方法
 * @author: jiangzq
 * @create: 2019-11-23 10:51
 **/
//主函数
public abstract class Testabstract_3 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.talk());
    }
}

//父类
abstract class Person_3 {
    String name = "张三";

    public Person_3(String name) {//声明一个构造方法
        this.name = name;

    }
    public abstract String talk();
}

//构造方法一定要在子类中被调用
class Student_3 extends Person_3 {

    public Student_3(String name) {
        super(name);//明确调用此构造方法
    }

    @Override
    public String talk() {
        return "姓名："+this.name;
    }
}
