package SetFramework.列表List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @program: java基础知识
 * @description:
 *         result =
 *             数组被修改后的内容是：
 *              L+O+V+E+
 *              将列表反向输出：E+V+O+L+
 * @author: jiangzq
 * @create: 2019-11-23 22:07
 **/
public class ArrayList_ListIterator {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("L");
        arrayList.add("O");
        arrayList.add("V");
        arrayList.add("E");
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            Object element = listIterator.next();
            listIterator.set(element + "+");
        }
        System.out.println("数组被修改后的内容是：");
        Iterator iterator =arrayList.iterator();
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.print(element+"");
        }
        System.out.println();
        System.out.print("将列表反向输出：");
        while (listIterator.hasPrevious()) {
            Object element = listIterator.previous();
            System.out.print(element+"");
        }
        System.out.println();
    }
}
