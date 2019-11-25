package SetFramework.列表List;

import java.util.LinkedList;

/**
 * @program: java基础知识
 * @description: LinkedList类是对AbstractSequentialList类的扩展，它提供一个链接列表的数据结构
 *                他有两种构造方法：
 *                      LinkedList()
 *                      LinkedList(Collection c)
 *              result =
 *                     linkedList最初的内容：[I, L, O, V, E, U]
 *                     删除后元素后的数组的大小：4
 *                     数组的内容：[L, O, V, E]
 * @author: jiangzq
 * @create: 2019-11-23 20:19
 **/
public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("L");
        linkedList.add("O");
        linkedList.add("V");
        linkedList.add("E");
        linkedList.addFirst("I");
        linkedList.addLast("U");
        System.out.println("linkedList最初的内容："+linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();//移除最后一个
        System.out.println("删除后元素后的数组的大小："+linkedList.size());
        System.out.println("数组的内容："+linkedList);
    }
}
