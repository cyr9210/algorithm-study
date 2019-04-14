import java.util.List;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("갯수 : ");
        int count = sc.nextInt();

        int[] n = new int[count];

        for (int i = 0; i < count; i++) {
            n[i] = sc.nextInt();
        }

        int answer = 1;

        int ex = 0;

        for (int i = 0; i < count; i++) {
            ex += n[i];
            if(ex < 0){
                if(answer + ex < 0){
                    answer = 1 - ex;
                }
            }
        }
        System.out.println(answer);

    }
}
