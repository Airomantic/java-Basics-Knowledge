package genericity;

import java.util.Hashtable;

/**
 * @program: java基础知识 上限通配符extends
 * @description:  字符型数据是不允许被加入到对象中
 *          result =
 *                    love
 * @author: jiangzq
 * @create: 2019-11-25 19:50
 **/
public class MyGenericExtends <K extends Number,V>{

    public static void main(String[] args) {
        MyGenericExtends<Integer, String> myGenericExtends = new MyGenericExtends<>();
        myGenericExtends.put(1,"love");
        String str = myGenericExtends.get(1);
        System.out.println(str);
    }
    public Hashtable<K, V> kvHashtable = new Hashtable<>();

    public void put(K k, V v) {
        kvHashtable.put(k, v);
    }

    public V get(K k) {
        return kvHashtable.get(k);
    }
}
