package day10;

public class FourDigits {
    public static void fourDigits(){
        System.out.print("一个四位数去掉首位，剩余三位乘3等于这个四位数，这个数是：");
        for(int i=1000;i<10000;i++){
            int threeDigits=i%1000;
            if(threeDigits*3==i)
                System.out.println(i+" ");
        }
    }

    public static void main(String[] args) {
        fourDigits();
    }
}
