package day08;

import java.util.Scanner;

public class TakeTaxi {
    public static void fare(int distance){
        if(distance<=3){
            System.out.println("车费为：8元。");
        }
        else if(distance<=5){
            System.out.println("车费为："+(8+(distance-3)*1.2)+"元。");
        }
        else {
            System.out.println("车费为:"+(8+(5-3)*1.2+(distance-5)*1.5)+"元。");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入公里数（单位千米）：");
        TakeTaxi.fare(scanner.nextInt());
    }
}
