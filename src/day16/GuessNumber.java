package day16;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void guessNumber(Number number){
        Scanner scanner=new Scanner(System.in);
        boolean correct=false;
        while (correct!=true){
            System.out.print("请输入你猜的数字：");
            int x=scanner.nextInt();
            if(x>number.getNumber())
                System.out.println("猜的数大了哦。");
            else if(x<number.getNumber())
                System.out.println("猜的数小了哦。");
            else{
                correct=true;
                System.out.println("恭喜你猜对了！");
            }
        }
    }
    public static void main(String[] args) {
        Random random=new Random();
        Number number=new Number(random.nextInt(100));
        guessNumber(number);
    }
}
class Number{
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
