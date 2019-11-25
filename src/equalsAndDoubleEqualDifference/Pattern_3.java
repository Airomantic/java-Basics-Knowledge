package equalsAndDoubleEqualDifference;

/**
 * @program: java基础知识
 * @description: 如果对象是一些API类中的对象
 *                    （1）“==”比较的是地址是否相等
 *                    （2）而equals()方法比较的是内容是否相等
 * @author: jiangzq
 * @create: 2019-11-20 22:03
 **/
public class Pattern_3 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("world");
        String str3 = "hello";
        String str4 = str1;
        System.out.println(str1 == str2);          //false
        System.out.println(str1 == str3);          //false
        System.out.println(str1 == str4);          //true
        System.out.println(str1.equals(str2));     //false
        System.out.println(str1.equals(str3));     //true
        System.out.println(str1.equals(str4));     //true
    }
}
