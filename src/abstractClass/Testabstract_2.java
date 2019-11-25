package abstractClass;

/**
 * @program: java基础知识
 * @description: 抽象方法留给子类去实现
 *                 result : 姓名：张三
 * @author: jiangzq
 * @create: 2019-11-23 10:51
 **/
//主函数
public abstract class Testabstract_2 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.talk());
    }
}
//父类
abstract class Person {
    String name = "张三";

    //method()方法加不加结果都一样
   /* public void method(String name) {
        System.out.println("姓名："+name);
    }*/
    public abstract String talk();
}

//子类
class Student extends Person {

    @Override
    public String talk() {
        return "姓名："+this.name;
    }
}
