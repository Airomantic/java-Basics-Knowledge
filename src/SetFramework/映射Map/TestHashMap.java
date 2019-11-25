package SetFramework.映射Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @program: java基础知识 映射（map）是一个存储关键字和值的关联，或说是“关键字/值”对的对象
 *                         即给定一个关键字，可以得到它的值
 *                         关键字和值都是对象，关键字必须唯一，但值是可以被复制的
 * @description:
 *     HashMap类使用散列表实现Map接口，其构造方法：
 *         HashMap()                              //构造一个默认的散落映射
 *         HashMap(Map m)                         //用类m中的元素初始化散列映射
 *         HashMap(int Capacity)                  //将散列集合的容量初始化为capacity
 *         HashMap(int Capacity,float fillRation) //用参数的同时初始化散列映射的容量和填充比
 *          result =
 *                   键值为three
 *                   对应的值为：C
 *                   键为：one对应的值为：A
 *                   键为：two对应的值为：B
 *                   键为：three对应的值为：C
 * @author: jiangzq
 * @create: 2019-11-23 22:23
 **/
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("one", "A");
        hashMap.put("two", "B");
        hashMap.put("three", "C");
        String query = "three";
        System.out.println("键值为"+query);
        String resultString = (String) hashMap.get(query);
        System.out.println("对应的值为："+resultString);
        Set<Map.Entry<String, String>> hsm = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> i = hsm.iterator();
        for (; i.hasNext();) {//注意;结尾
            Map.Entry entry = i.next();
            System.out.println("键为："+entry.getKey()+"对应的值为："+entry.getValue());
        }
    }
}
