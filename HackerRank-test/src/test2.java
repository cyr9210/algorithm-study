import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        List<String> answer = new ArrayList<>();
        a:
        for(int i = 0; i < count; i++){
            String s = in.next();
            Stack<Character> stack = new Stack<>();

            for(char c : s.toCharArray())
            {
                if(c == '(')
                    stack.push(')');
                else if(c == '{')
                    stack.push('}');
                else if(c == '[')
                    stack.push(']');

                else{
                    if( stack.isEmpty() || c != stack.peek()){
                        answer.add("NO");
                        continue a;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty())
                answer.add("YES");
            else
                answer.add("NO");
        }

        for(String s : answer){
            System.out.println(s);
        }
    }
}
