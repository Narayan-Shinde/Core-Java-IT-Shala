package collectionFramework.listImplmentations.stackDemo;

import java.util.Stack;

public class Demo1 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(100);
        stack.push(100);
        stack.push(null);
        stack.push(null);
        stack.push("abc");
        stack.push(true);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
