package equalsAndDoubleEqualDifference;

/**
 * @program: java基础知识
 * @description: 如果变量是引用类型
 *                 1.比较的是两个对象的地址值是否相等
 *                 2.而如果调用equals()方法的话，就会默认继承object类中的equals()方法，比较的是 是否是同一个对象
 *                   （1）也是比较两个对象的地址值是否相等
 *                   （2）但是一般使用的时候，没有任何意义，一般都会重写equals()方法
 *                         【1】如果没有对equals方法进行重写，则比较的是引用类型的变量所指向的对象的地址
 *                              [1] 诸如String、Date等类对equals方法进行了重写的话，比较的是所指向的对象的内容
 *                   （3）注意：equals方法不能作用于基本数据类型的变量
 * @author: jiangzq
 * @create: 2019-11-20 21:01
 **/
public class Pattern_2 {
    public static void main(String[] args) {
        Pattern p1 = new Pattern();
        Pattern p2 = new Pattern();
        Pattern p3 = p1;                     //p1赋给p3，所以它们成为了同一个对象，地址，值都相同
        System.out.println(p1==p2);          //false ，所指向对象的地址不同
        System.out.println(p1==p3);          //true
        System.out.println(p1.equals(p2));   //false ，不是同一个对象，即错误
        System.out.println(p1.equals(p3));   //true  ，同一个对象，地址相同，且对象内容都一样，注意不会比较地址值，因为equals方法不能作用于基本数据类型的变量
    }
}

class Pattern {
    public void show() {
        System.out.println("这是show()方法");
    }
}

