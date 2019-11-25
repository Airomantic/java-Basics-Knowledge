package SetFramework;

import java.util.Hashtable;

/**
 * @program: java基础知识
 * @description:
 *    result =
 *           two=2
 * @author: jiangzq
 * @create: 2019-11-25 16:05
 **/
public class MyHashtable {
    public static void main(String[] args) {
        Hashtable num = new Hashtable();
        num.put("one", new Integer(1));
        num.put("two", new Integer(2));
        num.put("three", new Integer(3));

        Integer n = (Integer) num.get("two");
        if (n != null) {
            System.out.println("two=" + n);
        }
    }
}
