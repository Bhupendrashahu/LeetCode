import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String s="()[]{}";
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char cr = s.charAt(i);
            if (cr == '(' || cr == '{' || cr == '[') {
                stack.push(cr);
            } else if (stack.isEmpty()) {
                System.out.println("false");
                return ;
            }
            if (cr == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    System.out.println("false");
                    return;
                }
            }
//            System.out.println(stack.isEmpty()+"1");
            if (cr == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    System.out.println("false");
                    return;
                }
            }
//            System.out.println(stack.isEmpty()+"2");
            if (cr == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    System.out.println("false");
                    return ;
                }

            }
        }
        if (stack.isEmpty()){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
