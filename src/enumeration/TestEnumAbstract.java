package enumeration;

/**
 * @program: java基础知识
 * @description:
 *           result =
 *                     0------RED:红色
 *                     1------YELLOW:黄色
 *                     2------BLUE:蓝色
 * @author: jiangzq
 * @create: 2019-11-23 17:50
 **/
public class TestEnumAbstract {
    public static void main(String[] args) {
        for (Color_abstract c : Color_abstract.values()) {
            System.out.println(c.ordinal()+"------"+c.name()+":"+c.getColor());
        }
    }

}

enum Color_abstract {
    RED{
        public String getColor() { //单独实现抽象方法
            return "红色";
        }
    },   //注意这是,
    YELLOW{
        public String getColor() {
            return "黄色";
        }
    },
    BLUE {
        public String getColor() {
            return "蓝色";
        }
    };

    public abstract String getColor();
}