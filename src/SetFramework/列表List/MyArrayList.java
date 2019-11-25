package SetFramework.列表List;

import java.util.ArrayList;

/**
 * @program: java基础知识
 * @description:  arrayList类是对AbstractList类的扩展，支持可随需要而增长的动态数组
 *                 在Java中，标准数组是定长，不能加长或缩短，意味着开发者必须先知道数组能容纳多少元素，运行之后才知道需要多大数组
 *                 而类集框架定义的ArrayList，可以动态增加或减小其大小
 *                 ArrayList三种构造方法：
 *                      ArrayList()                        建立一个空的数组列表
 *                      ArrayList(Collection c)            建立一个列表，该列表有类c中的元素初始化
 *                      ArrayList(int initialCapacity)     建立一个数组列表，该数组有指定的初始化容量（capacity)
 *
 *            result =
 *                   数组的大小：0
 *                   加入元素之后数组的大小：[I, L, O, V, E]
 *                   数组的内容：[I, L, O, V, E]
 *                   删除之后的数字大小：3
 *                   数组内容：[I, L, V]
 * @author: jiangzq
 * @create: 2019-11-23 19:54
 **/
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println("数组的大小：" + arrayList.size());
        arrayList.add("L");
        arrayList.add("O");
        arrayList.add("V");
        arrayList.add("E");
        arrayList.add(0, "I");//把“I”加到第一个位置
        System.out.println("加入元素之后数组的大小：" + arrayList);
        System.out.println("数组的内容："+arrayList);
        arrayList.remove("E");  //移除该字母
        arrayList.remove(2);//移除第二个（即“O”）
        System.out.println("删除之后的数字大小："+arrayList.size());
        System.out.println("数组内容："+arrayList);
    }
}
