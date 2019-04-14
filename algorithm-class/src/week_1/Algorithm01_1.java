package week_1;

import java.util.Scanner;

public class Algorithm01_1 {
        Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Algorithm01_1 execute = new Algorithm01_1();

//        execute.max();
//        execute.judgeSign();
//        execute.sum();
//        execute.multi99table();
        execute.triangleLB();
    }

    public void max(){
        System.out.println("세 정수의 최대값을 구합니다.");

        System.out.print("a : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("b : ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.print("c : ");
        int c = sc.nextInt();
        sc.nextLine();

        int max = a;

        if (max < b) {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        System.out.println(max);


    }

    public void judgeSign(){
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("양수입니다.");
        } else if (n < 0) {
            System.out.println("음수입니다.");
        }else{
            System.out.println("0입니다.");
        }
    }

    public void sum(){
        /*무한for문 사용(while(ture)도 마찬가지

        int n;

        for (;;){
            System.out.print("n : ");
            n = sc.nextInt();
            sc.nextLine();

            if(n > 0){
                break;
            }else{
                System.out.println("0보다 큰 숫자를 입력해주세요.");
            }
        }*/


        int n;

        do{
            System.out.print("n : ");
            n = sc.nextInt();
            sc.nextLine();

            if (n <= 0) {
                System.out.println("0보다 큰 숫자를 입력해주세요.");
            }
        }while(n <= 0);


        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(n + "까지 합 : " + sum);
    }

    public void multi99table(){
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j <  10; j++) {
                System.out.printf("%3d", i*j);
            }
            System.out.println();
        }
    }

    public void triangleLB(){
        int n;
        System.out.println("왼쪽아래가 직각인 직각 삼각형 출력");

        do{
            System.out.print("n : ");
            n = sc.nextInt();
            sc.nextLine();
        }while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
