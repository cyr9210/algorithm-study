import java.util.*;

public class Solution1 {

    public int solution(int [] example){
        int answer = 0;

        Stack<Integer> three = new Stack<>();
        Stack<Integer> two = new Stack<>();
        Stack<Integer> one = new Stack<>();


        for (int i = 0; i < example.length; i++) {
            int j = example[i];
            if (j == 4){
                answer ++;
            }

            if (j == 3 ){
                answer = process(answer, three, one, j);

            }

            if (j == 2){
                answer = process(answer, two, two, j);
            }

            if (j == 1){
                answer = process(answer, one, three, j);
            }
        }

        int n = one.size() + two.size()*2 + three.size()*3;

        if (n % 4 == 0){
            answer += n/4;
            return answer;
        }

        answer += n/4 + 1;

        return answer;
    }

    private int process(int answer, Stack<Integer> num1, Stack<Integer> num2, int j) {
        if (num2.empty()) {
            num1.push(j);
            return answer;
        }
        num2.pop();
        answer++;
        return answer;
    }


    public static void main(String[] args) {
        int[] example = {2,3,2,3,4,1,4,2,2};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(example));
    }
}
