package SetFramework.集合Set;

import java.util.HashSet;

/**
 * @program: java基础知识        Set集合是一种不重复元素的Collection
 *              HashSet类是对AbstractSet类的扩展，它创建了一个类集
 *                                该类集使用散列表进行存储
 *                                而散列表则通过“散列法”的机制来存储信息
 *                                在散列中，一个关键字的信息内容被用来确认唯一的一个值，称为散列码
 *                                散列码---它被用来当作与关键字相连的数据的存储下标
 *         HashSet类的构造方法：
 *           HashSet()                                     //构造一个默认的散列集合
 *           HashSet(Collection c)                         //用类c中的元素初始化散列集合
 *           HashSet(int initialCapacity)                  //用capacity初始化散列集合
 *           HashSet(ini initialCapacity,float fillRatio)  //用参数初始化散列集合的容量和填充比（也称 加载容量0.0~1.0）
 * @description:
 * @author: jiangzq
 * @create: 2019-11-23 21:10
 **/
public class TestHashSet {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(String.valueOf(1));
        hashSet.add(String.valueOf(2));
        hashSet.add(String.valueOf(3));
        hashSet.add(String.valueOf(4));
        hashSet.add(String.valueOf(4));
        hashSet.remove(String.valueOf(2));
        hashSet.add(null);
        System.out.println("HashSet中的元素包括："+hashSet);
    }
}
