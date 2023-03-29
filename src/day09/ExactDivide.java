package day09;

import java.util.Scanner;

public class ExactDivide {
    public static void exactDivide(int x) {
        int count=0;
        for(int i=1;i<=x;i++){
            if(i%7!=0){
                count+=i;
            }
        }
        System.out.println(x+"以内不能被7整除的数之和为："+count+".");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入一个整数：");
        exactDivide(scanner.nextInt());
    }
}
