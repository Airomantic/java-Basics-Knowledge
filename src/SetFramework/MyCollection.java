package SetFramework;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @program: java基础知识
 * @description:
 *               result =
 *                       反向输出列表：2 1 0
 *                       随机输出列表: 1 2 0
 * @author: jiangzq
 * @create: 2019-11-23 19:40
 **/
public class MyCollection {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Integer(1));
        linkedList.add(new Integer(2));
        linkedList.add(new Integer(0));
        //Comparator也可以看成一种排序算法的实现，将算法和数据分离
        Comparator comparator = Comparator.reverseOrder(); //逆序
        Collections.sort(linkedList,comparator);
        Iterator iterator = linkedList.iterator();
        System.out.print("反向输出列表：");
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");
            System.out.println();
        Collections.shuffle(linkedList);
        iterator = linkedList.iterator();
        System.out.print("随机输出列表: ");
        while (iterator.hasNext())
            System.out.print(iterator.next()+ " ");
    }
}
