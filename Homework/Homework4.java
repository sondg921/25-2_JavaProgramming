package Homework;

import java.util.Scanner;

public class Homework4 {
    int gcd(int m, int n){
        if(n == 0){
            return m;
        }
        if(m > n){
            return gcd(n, m % n);
        }
        else{
            return gcd(m, n % m);
        }
    }

    public static void main(String[] args) {
        Homework4 homework4 = new Homework4();
        Scanner sc = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.printf("두 수의 최대공약수는 %d입니다.", homework4.gcd(m, n));
    }
}