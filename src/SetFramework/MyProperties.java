package SetFramework;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @program: java基础知识
 * @description: 属性Properties是Hashtable类的一个子类，用来保持值的列表，其中关键字和值都是字符串
 *           当获得系统环境值时，System.getProperties()返回对象的类型
 *
 *        result =
 *            国家：英国,首都：伦敦
 *            国家：中国,首都：北京
 *            国家：美国,首都：华盛顿
 *
 *            法国首都:没有发现
 * @author: jiangzq
 * @create: 2019-11-25 16:
 **/
public class MyProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        Set states;
        String str;
        properties.put("中国", "北京");
        properties.put("英国", "伦敦");
        properties.put("美国", "华盛顿");
        states = properties.keySet();
        Iterator iterator = states.iterator();
        while (iterator.hasNext()) {
            str = (String) iterator.next();
            System.out.println("国家："+str+",首都："+properties.getProperty(str));
        }
        System.out.println();
        str = properties.getProperty("法国", "没有发现");
        System.out.println("法国首都:" + str);
    }
}
