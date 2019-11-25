package SetFramework.集合Set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @program: java基础知识 TreeSet类为使用树来进行存储的Set接口提供了一个工具，对象按升序进行存储，方便对其访问和检索
 *                         存储大量的需要快速检索的排序信息，TreeSet是很好的选择
 *            TreeSet()                 //构造一个空的树集合，其元素按升序排序
 *            TreeSet(Collection c)     //用类c中的元素初始化树集合
 *            TreeSet(Comparator comp)  //按照由comp指定的比较方法进行排序
 *            TreeSet(SortedSet ss)     //构造了一个包含了ss的元素的树集合
 * @description: 通过迭代方法访问类集
 *                Iterator可以完成通过循环输出类集内容，从而获得或删除元素
 *                ListIterator是对Iterate的扩展，允许双向遍历列表，并且可以修改单元
 *          result =
 *                 创建TreeSet类：
 *                              aa
 *                              bb
 *                              cc
 *                              第一个元素为：aa
 *                              最后一个元素：cc
 * @author: jiangzq
 * @create: 2019-11-23 21:27
 **/
public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        System.out.println("创建TreeSet类：");
        TreeSet treeSet_2 = new TreeSet();
        treeSet_2.add("aa");
        treeSet_2.add("bb");
        treeSet_2.add("cc");
        Iterator iterators = treeSet_2.iterator();
        while (iterators.hasNext()) {
            System.out.println(iterators.next());
        }
        System.out.println("第一个元素为："+ treeSet_2.first());
        System.out.println("最后一个元素："+treeSet_2.last());
    }
}
