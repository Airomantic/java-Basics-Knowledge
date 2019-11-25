package SetFramework.映射Map;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @program: java基础知识
 * @description: TreeMap类通过使用树实现Map接口，它提供了按排序存储关键字/值对的有效手段，同时允许快速检索
 *                 不像散列映射，树映射保证它的元素按照关键字升序排序
 *                 TreeMap的构造方法：
 *                 TreeMap()                                       //构造一个空树的映射
 *                 TreeMap(Map m)                                  //用类m中的元素初始化树映射，使用关键字按自然排序
 *                 TreeMap(Comparator comp)                        //构造一个空的基于树的映射通过的使用Comparator来排序
 *                 TreeMap(SortedMap sm)                           //用从sm的输入来初始化一个树映射
 *     result =
 *          所有的元素的值为：{1=L, 2=E, 3=O, 4=V}
 *          元素的值为：L
 *          元素的值为：E
 *          元素的值为：O
 *          元素的值为：V
 * @author: jiangzq
 * @create: 2019-11-25 11:13
 **/
public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(1, "L"); //加入不同的键值对
        treeMap.put(3, "O");
        treeMap.put(4, "V");
        treeMap.put(2, "E");
        System.out.println("所有的元素的值为："+treeMap);
        Iterator iterator = treeMap.keySet().iterator();//为treeMap对象中的键值添加一个迭代器
        for (; iterator.hasNext();) {
            System.out.println("元素的值为："+treeMap.get(iterator.next()));
        }
    }
}
