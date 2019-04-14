package codingtest_uahan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test07 {
    public static void main(String[] args) {
        Test07 test = new Test07();
        System.out.println(test.solution("zyellleyz"));
    }

    public String solution(String cryptogram) {
        int length = cryptogram.length();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            list.add(cryptogram.substring(i, i+1));
        }


        boolean judge = true;

        while(true){
            List<Integer> delete = new ArrayList<>();

            for (int i = 1; i < list.size(); i++) {
                if(list.get(i).equals(list.get(i-1))){

                    delete.add(i);
                    delete.add(i-1);
                    judge = false;
                }
            }
            Collections.sort(delete);
            Collections.reverse(delete);

            for (int i = 1; i < delete.size(); i++) {
                if(delete.get(i) == delete.get(i-1)){
                    delete.remove(i-1);
                }
            }


            if(judge){
                break;
            }else{
                for (int i = 0; i < delete.size(); i++) {
                    list.remove((int)delete.get(i));

                }
                judge = true;
            }
        }

        String answer = "";

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }

        return answer;
    }


}
