import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Solution1 {
    public int solution(int[] s) {
        int answer = 0;

        List<Integer> group = new ArrayList<>();

        for (int n : s){
            group.add(n);
        }

        Collections.sort(group);
        Collections.reverse(group);

        List<Integer> remove = new ArrayList<>();

        answer = check4(answer, group, remove);

        Collections.reverse(group);

        for (Integer n : group) {
            remove.add(n);
            int sum = sum(remove);

            if(sum < 4){
                continue;
            }else if(sum == 4){
//                group.removeAll(remove);
                remove.clear();
                answer ++;
            }else{
                int k = remove4(remove);
//                group.removeAll(remove);
                remove.clear();
                answer ++;
                remove.add(k);
            }
        }

        if(!remove.isEmpty()){
            answer++;
        }

        System.out.println(answer);

        return answer;
    }

    private int remove4(List<Integer> remove) {
        int sum = sum(remove);

        for (int n : remove){
            if(sum-n == 4){
                return n;
            }
        }
        return remove.get(remove.size()-1);
    }

    private int check4(int answer, List<Integer> group, List remove) {
        for (int n : group) {
            if(n == 4){
                remove.add(n);
                answer ++;
            }
        }
        group.removeAll(remove);
        remove.clear();
        return answer;
    }

    private int sum(List<Integer> list){
        int sum = 0;
        for (int n : list){
            sum += n;
        }
        return sum;
    }




    public static void main(String[] args) {
        int[] example = {2,3,4,4,2,1,3,1};
        Solution1 solution1 = new Solution1();
        solution1.solution(example);
    }
}
