package interfaces;

/**
 * @program: java基础知识 接口比抽象类更加抽象
 *                         接口也被称为界面，是用来组织应用中的各类并调节它们的相互关系的一种结构
 *                         准确地说，接口用来实现类间多层继承功能的结构
 * @description:  (final) 数据类型 成员名称=常量；
 *                   abstract 返回值的数据类型 方法名称（参数...）
 *
 * @author: jiangzq
 * @create: 2019-11-23 11:17
 **/
public class Testinterface_1 {
    public static void main(String[] args) {
        int n = demo.i + 1;//改变i的值 运行结果=3
        System.out.println(n);
    }
}

interface demo {
    int i = 2;
}
