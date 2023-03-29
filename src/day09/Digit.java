package day09;

import java.util.Scanner;

public class Digit {
    public static void dight(int x){
        int number=0;
        int one=0;
        int two=0;
        int three=0;
        int four=0;
        int five=0;
        if(x<10){
            number=1;
            one=x;
        }
        else if(x<100){
            number=2;
            one=x%10;
            two=x/10;
        }
        else if(x<1000){
            number=3;
            one=x%10;
            two=(x/10)%10;
            three=x/100;
        }
        else if(x<10000){
            number=4;
            one=x%10;
            two=(x/10)%10;
            three=(x/100)%10;
            four=x/1000;
        }
        else if(x<100000){
            number=5;
            one=x%10;
            two=(x/10)%10;
            three=(x/100)%10;
            four=(x/1000)%10;
            five=x/10000;
        }
        else {
            System.out.println("输入的数不在范围内！");
            return;
        }
        //System.out.println("这个数是"+number+"位数.");
        int count=0;
        switch (number){
            case 1:
                count=one;
                break;
            case 2:
                count=one*10+two;
                break;
            case 3:
                count=one*100+two*10+three;
                break;
            case 4:
                count=one*1000+two*100+three*10+four;
                break;
            case 5:
                count=one*10000+two*1000+three*100+four*10+five;
                break;
            default:
                System.out.println("这个数我算不了！");
        }
        System.out.println("这个数是"+number+"位数，逆序输出为："+count+"。");
    }
    public static void main(String[] args) {
        System.out.print("请输入一个不多于五位的数字：");
        Scanner scanner=new Scanner(System.in);
        dight(scanner.nextInt());
    }
}
