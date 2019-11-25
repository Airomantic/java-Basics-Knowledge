package SetFramework;

import java.util.Stack;

/**
 * @program: java基础知识
 * @description:
 *           result =
 *                push_stack=[L, O, V, E]
 *                pop_stack=[L, O]
 *                peek_stack=O
 *                -1
 *                2
 * @author: jiangzq
 * @create: 2019-11-25 15:33
 **/
public class MyStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("L");
        stack.push("O");
        stack.push("V");
        stack.push("E");
        System.out.println("push_stack="+stack);
        stack.pop(); //弹出 E
        stack.pop(); //弹出 V
        System.out.println("pop_stack="+stack); //打印剩余栈中的元素
        if (!stack.empty()) {
            System.out.println("peek_stack="+stack.peek()); //栈顶元素为 O
        }
        stack.push("!");
        int i = stack.search("E");
        System.out.println(i);
        int j = stack.search("O");
        System.out.println(j);
    }
}
