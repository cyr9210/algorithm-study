package codingtest_uahan;

public class Test01 {

    public static void main(String[] args) {
        Test01 test = new Test01();
        test.solution(50237);
    }

    public int[] solution(int money) {
        int[] answer = new int[9];

        int[] currency = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

        for (int i = 0; i < currency.length; i++) {
            answer[i] = money / currency[i];
            money = money % currency[i];
            if (money == 0) {
                break;
            }
        }
//
//        answer[0] = money / 50000;
//        money = money%50000;
//
//        answer[1] = money / 10000;
//        money = money%10000;
//
//        answer[2] = money / 5000;
//        money = money % 5000;
//
//        answer[3] = money / 1000;
//        money = money % 1000;
//
//        answer[4] = money / 500;
//        money = money % 500;
//
//        answer[5] = money / 100;
//        money %

        return answer;
    }


}
