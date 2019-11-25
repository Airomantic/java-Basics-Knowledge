package genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java基础知识
 * @description: 由于Integer和Float是Number类型，因此numSuper的下限是Number类
 *        result =
 *            [3, 3.14]
 * @author: jiangzq
 * @create: 2019-11-25 20:14
 **/
public class MyGenericSuper {
    public static void main(String[] args) {
        List<? super Number> numSuper = new ArrayList<>();
        numSuper.add(3);
        numSuper.add(new Float(3.14));
        System.out.println(numSuper);
    }
}
