package org.java_gyan.problem_solving.day2;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String str="{()";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='{')
            {
                stack.push('}');
            }
          else   if(ch=='[')
            {
                stack.push(']');
            }
          else   if(ch=='(')
            {
                stack.push(')');
            }
        else     if(stack.isEmpty()||stack.pop()!=ch)
            {
                System.out.println("Not Valid");
            }
        }
        System.out.println("Validation "+stack.isEmpty());
    }
}
