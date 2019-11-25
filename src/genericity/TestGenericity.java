package genericity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: java基础知识
 * @description:  使用多个泛型
 *         result =
 *                 key: time_1, Value: 2019-11-25 19:35:32
 *                 key: time_2, Value: 2019-11-25 19:35:32
 *                 key: time_3, Value: 2019-11-25 19:35:32
 * @author: jiangzq
 * @create: 2019-11-25 19:31
 **/
public class TestGenericity {
    public static void main(String[] args) {
        Map<String, Date> map = new HashMap<>();

        map.put("time_1", new Date());
        map.put("time_2", new Date());
        map.put("time_3", new Date());

        for (String key : map.keySet()) {
            Date date = map.get(key);
            System.out.printf("key: %1$s, Value: %2$tF %2$tT%n",key,date);//注意：这里是printf
        }
    }
}
