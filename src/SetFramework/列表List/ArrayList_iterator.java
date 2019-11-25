package SetFramework.列表List;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @program: java基础知识
 * @description:
 *           result =
 *                   数组的内容是：
 *                   LOVE
 * @author: jiangzq
 * @create: 2019-11-23 21:52
 **/
public class ArrayList_iterator {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("L");
        arrayList.add("O");
        arrayList.add("V");
        arrayList.add("E");
        System.out.println("数组的内容是：" );
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.print(element+"");
        }
        System.out.println();
    }
}
