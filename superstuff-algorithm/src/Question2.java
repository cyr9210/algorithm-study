import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Question2 {

    public static void main(String[] args) {
        int[][] s = new int[3][3];
        s[0] = new int[]{1, 2, 3};
        s[1] = new int[]{4, 5, 6};
        s[2] = new int[]{7, 8, 9};
        solution(s);
    }

    public static int solution(int[][]s) {
        List<String> issues = new ArrayList<>();
        System.out.println(s[2][2]);
        return 0;
    }

    public static boolean isRight(int[][] s, List<String> issues) {
        int num = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                num += s[i][j];
            }
            if (num != 15)
                return false;
            num = 0;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                num += s[j][i];
            }
            if (num != 15)
                return false;
        }
        return true;
    }


}
