package day11;

import java.util.Scanner;

public class PrimeNumber {
    public static void smallPrimeNumber(int x){
        boolean acquire=false;
        int i=0;
        for(i=x+1;;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    break;
                }
                if(j==i/2){
                    acquire=true;
                }
            }
            if(acquire==true){
                break;
            }
        }
        System.out.println("大于"+x+"的最小质数为："+i);
    }

    public static void main(String[] args) {
        System.out.print("请输入一个数：");
        Scanner scanner=new Scanner(System.in);
        smallPrimeNumber(scanner.nextInt());
    }
}
