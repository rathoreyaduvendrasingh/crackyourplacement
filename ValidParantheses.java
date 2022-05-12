import java.io.*;
import java.util.*;


public class ValidParantheses {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean ans = true;
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                if(s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')'){
                    return false;
                }else{
                    stack.push(s.charAt(i));
                }
            }else{
                if(s.charAt(i)==')'){
                    if(stack.peek()=='('){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else if(s.charAt(i)=='}'){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else if(s.charAt(i)==']'){
                    if(stack.peek()=='['){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else{
                    stack.push(s.charAt(i));
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return ans;
    }
}