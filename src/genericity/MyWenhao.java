package genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java基础知识
 * @description:
 *          result =
 *           lo
 *           ve
 * @author: jiangzq
 * @create: 2019-11-25 19:44
 **/
public class MyWenhao {
    public void print(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("lo");
        str.add("ve");
        MyWenhao wenhao = new MyWenhao();
        wenhao.print(str);
    }
}
