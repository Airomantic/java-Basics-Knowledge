package enumeration;

import java.util.EnumMap;
import java.util.Map;

/**
 * @program: java基础知识
 * @description: EnumMap对对象的控制
 * result =
 *         RED-----红色
 *         YELLOW-----黄色
 *         BLUE-----蓝色
 * @author: jiangzq
 * @create: 2019-11-23 17:13
 **/
public class MyEnumMap_1 {
    public static void main(String[] args) {
        EnumMap<Color_1, String> t = new EnumMap<Color_1, String>(Color_1.class);
        t.put(Color_1.RED, "红色");
        t.put(Color_1.YELLOW, "黄色");
        t.put(Color_1.BLUE, "蓝色");
        for (Map.Entry<Color_1, String> a : t.entrySet()) {
            System.out.println(a.getKey()+"-----"+a.getValue());
        }
    }
}
enum Color_1{RED,YELLOW,BLUE}//末尾没必要加上 ;