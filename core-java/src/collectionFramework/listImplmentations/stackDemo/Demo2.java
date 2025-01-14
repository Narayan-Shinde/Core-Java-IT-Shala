package collectionFramework.listImplmentations.stackDemo;

import java.util.Stack;

public class Demo2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(100);
        stack.push(100);
        stack.push(null);
        stack.push(null);
        stack.push("abc");
        stack.push(true);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println("Size of the stack " + stack.size());
        System.out.println("is stack empty " + stack.empty());
        System.out.println("is element present in the stack " + stack.search("abc"));

    }
}
