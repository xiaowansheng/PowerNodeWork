package day09;

import java.util.Scanner;

public class PerfectNumber {
    public static void perfectNumber(int x){
        System.out.print(x+"以内的完数有：");
        for(int i=1;i<=x;i++){
            int count=0;
            int j=0;
            for(j=1;j<=i/2;j++){
                if(i%j==0){
                    count+=j;
                }
            }
            if(count==i){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        perfectNumber(scanner.nextInt());
    }
}
