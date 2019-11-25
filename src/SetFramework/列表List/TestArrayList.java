package SetFramework.列表List;

import java.util.ArrayList;

/**
 * @program: java基础知识
 * @description:
 *             result =
 *                   ArrayList操作后的结果：
 *                    [0, 6, 7, 3, 4]
 *                    索引为3的元素长度为：1
 *                    索引为4的元素长度为：1
 * @author: jiangzq
 * @create: 2019-11-23 20:02
 **/
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(String.valueOf(i));
        }
        for (int i = 6; i < 8; i++) {
            arrayList.set(i - 5, String.valueOf(i));
        }
        System.out.println("ArrayList操作后的结果：");
        System.out.println(arrayList);
        Object o = arrayList.get(3);
        String s = (String) o;
        System.out.println("索引为3的元素长度为："+s.length());
        Object o_1 = arrayList.get(4);
        String s_1 = (String) o_1;
        System.out.println("索引为4的元素长度为："+s_1.length());
    }
}
