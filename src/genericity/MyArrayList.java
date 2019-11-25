package genericity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: java基础知识
 * @description:
 *        result =
 *           add_arrayList=[red, blue, 20]
 *           red
 *           blue
 *           20
 * @author: jiangzq
 * @create: 2019-11-25 16:28
 **/
public class MyArrayList {
    public static void main(String[] args) {
        List arrayList = new ArrayList();  //构造一个列表对象，并向其中添加不同类型的元素
        arrayList.add("red");
        arrayList.add(1, "blue");
        arrayList.add(20);
        System.out.println("add_arrayList="+arrayList);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String listKey = iterator.next().toString();//迭代列表中的元素并依次输出
            System.out.println(listKey);
        }
    }
}
