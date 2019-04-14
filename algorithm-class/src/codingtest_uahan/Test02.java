package codingtest_uahan;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

    public static void main(String[] args) {
        Test02 test = new Test02();
        System.out.println(test.solution(new int[][] {{0, 0, 20, 10}, {10, 20, 20, 40}, {30, 0, 50, 20}}, new int[][] {{20, 40, 30, 50}, {30, 20, 50, 30}}, new int[] {20, 30, 30, 40}));
    }

    public int test(int[][] lands, int[][] wells, int[] point) {
        int answer = lands[2][0];
        return answer;
    }

    public boolean solution(int[][] lands, int[][] wells, int[] point) {
        boolean answer = false;

        for (int i = 0; i < lands.length; i++) {
            if((lands[i][0] < point[0] && point[0] < lands[i][2]) || (lands[i][0] < point[2] && point[2] < lands[i][2])){
                if((lands[i][1] < point[1] && point[1] < lands[i][3]) || (lands[i][1] < point[2] && point[2] < lands[i][3])){
                    return false;
                }
            }
        }


        for (int i = 0; i < wells.length; i++) {
            if((point[0] < wells[i][0] && wells[i][0] < point[2]) || (point[0] < wells[i][2] && wells[i][2] < point[2])){
                if((point[1] < wells[i][1] && wells[i][1] < point[3]) || (point[1] < wells[i][2] && wells[i][2] < point[3])) {
                    answer = true;
                }
            }

        }

        return answer;
    }



}
