package enumeration;

/**
 * @program: java基础知识
 * @description:
 * result=
 *          RED、
 *         YELLOW、
 *         BLUE、
 * @author: jiangzq
 * @create: 2019-11-23 17:09
 **/
public class TestColor_2 {
    public static void main(String[] args) {
        for (Color c : Color.values()) {
            System.out.println(c+"、");
        }
    }
}
