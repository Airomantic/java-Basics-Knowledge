package SetFramework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @program: java基础知识 颠倒比较输出，用来实现逆向排序
 * @description:
 *       int compare(Object o1,Object o2)   o1,o2为被比较的对象
 *                                         当obj1 等于 obj2 时，方法返回0
 *                                         当obj1 大于 obj2 时，方法返回一个正值
 *                                         当obj1 小于 obj2 时，方法返回一个负值
 *                                         当obj1 和 obj2 类型不兼容，方法引发一个ClassCastException异常
 *            result =
 *                 V O L E
 *          //根据26个字母倒序
 * @author: jiangzq
 * @create: 2019-11-25 11:56
 **/
public class Comparator_set_map {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new TestComparator());
        treeSet.add("L");
        treeSet.add("O");
        treeSet.add("V");
        treeSet.add("E");
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.print(element+" ");
        }
    }
}

class TestComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String a1, b1;
        a1 = (String) o1;
        b1 = (String) o2;
        return b1.compareTo(a1);
    }
}
