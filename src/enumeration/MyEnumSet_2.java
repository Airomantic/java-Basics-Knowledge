package enumeration;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * @program: java基础知识
 * @description: EnumSet本身是Set接口的子类，但是此类中没有定义任何的构造方法
 *                                            这表示构造方法被私有化了
 *                                            所有对此类方法的操作均是静态操作
 * result =
 *         RED
 *         YELLOW
 *         BLUE
 * @author: jiangzq
 * @create: 2019-11-23 17:27
 **/
public class MyEnumSet_2 {
    public static void main(String[] args) {
        EnumSet<Color_2> t = EnumSet.allOf(Color_2.class);//将全部内容设置到集合
        Iterator<Color_2> m = t.iterator(); //iterator 迭代
        while (m.hasNext()) {
            System.out.println(m.next());
        }
    }
}
enum Color_2{RED,YELLOW,BLUE}