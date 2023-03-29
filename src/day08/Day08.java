package day08;

import java.util.Scanner;

public class Day08 {
    public void order(int number1,int number2,int number3){
        if(number1>number2){
            int s=number1;
            number1=number2;
            number2=s;
        }
        if(number2>number3){
            int s=number2;
            number2=number3;
            number3=s;
        }
        if(number1>number3){
            int s=number3;
            number3=number1;
            number1=s;
        }
        System.out.println(number1+","+number2+","+number3+".");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int number3=scanner.nextInt();
        Day08 day=new Day08();
        day.order(number1,number2,number3);
    }
}
