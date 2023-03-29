package day09;

import java.util.Scanner;

public class Compute {
    public static void compute(int x){
        Boolean symbol=true;
        int  count=1;
        for(int i=2;i<=x;i++){
            if(symbol==true){
                count+=i;
                symbol=false;
            }
            else{
                count+=-i;
                symbol=true;
            }
        }
        System.out.println("结果为："+count+".");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入一个数字：");
        compute(scanner.nextInt());
    }
}
