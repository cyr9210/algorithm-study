import java.util.*;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("갯수 : ");
        int count = sc.nextInt();
        sc.nextLine();


        List<String> answer = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            List<String> pangram = new ArrayList<>(Arrays.asList(alphabet));

            //            Set<String> pangram = new HashSet<>(Arrays.asList(alphabet));

            System.out.print("문자 : ");
            String input = sc.nextLine();

            char[] input_letter = input.toCharArray();

            for (int j = 0; j < input_letter.length; j++) {
                if(pangram.contains(Character.toString(input_letter[j]))){
                    pangram.remove(Character.toString(input_letter[j]));
                }
            }

            if(pangram.isEmpty()){
                answer.add("1");
            }else {
                answer.add("0");
            }
        }

        System.out.println(answer.toString());



    }


}
