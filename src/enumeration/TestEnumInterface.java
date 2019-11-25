package enumeration;

/**
 * @program: java基础知识
 * @description: 枚举的接口
 * result =
 *         0-----RED:红色
 *         1-----YELLOW:黄色
 *         2-----BLUE:蓝色
 * @author: jiangzq
 * @create: 2019-11-23 17:43
 **/
public class TestEnumInterface {
    public static void main(String[] args) {
        for (Color_interface c : Color_interface.values()) {
            System.out.println(c.ordinal()+"-----"+c.name()+":"+c.getColor());
        }
    }
}

interface Demo {
    public String getColor();
}

enum Color_interface implements Demo {
    RED{
        @Override
        public String getColor() { //任何一个对象必须分别实现接口中的抽象方法
            return "红色";
        }
    },   //注意这是 ,
    YELLOW{
        @Override
        public String getColor() {
            return "黄色";
        }
    },
    BLUE {
        @Override
        public String getColor() {
            return "蓝色";
        }
    }          //可以不用加 ;
}