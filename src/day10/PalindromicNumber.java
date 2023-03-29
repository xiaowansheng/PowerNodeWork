package day10;

import java.util.Scanner;

public class PalindromicNumber {
    public static void palindromicNumber(int x){
        if(x<10000||x>99999){
            System.out.println("输入的数不是五位数！");
            return;
        }
        int one=x%10;
        int two=(x/10)%10;
        int tour=(x/1000)%10;
        int five=(x/10000)%10;
        if(one==five&&two==tour){
            System.out.println("这个数"+x+"是回文数。");
        }
        else
            System.out.println("这个数"+x+"不是回文数。");
    }

    public static void main(String[] args) {
        System.out.print("请输入一个五位数：");
        Scanner scanner=new Scanner(System.in);
        palindromicNumber(scanner.nextInt());
    }
}
