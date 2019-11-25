package SetFramework.列表List;

import java.util.LinkedList;

/**
 * @program: java基础知识
 * @description:
 *            result =
 *               ArrayList操作后的结果：
 *               [0, 1, 2, 3, 11, 10, 9, 8, 7, 6]
 * @author: jiangzq
 * @create: 2019-11-23 20:51
 **/
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 10; i++) {
            linkedList.add(String.valueOf(i));
        }
        for (int i = 4; i < 10; i++) {//从第4个开始，便是这个循环了
            linkedList.set(i, String.valueOf(10 - i + 5));
        }
        System.out.println("ArrayList操作后的结果：");
        System.out.println(linkedList);
    }
}
