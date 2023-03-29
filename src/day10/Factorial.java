package day10;

public class Factorial {
    public static void factorial(int number){//1到number的阶乘之和
        int count=0;
        for(int i=1;i<=number;i++){
            int x=1;
            for(int j=i;j>=1;j--){
                x*=j;
            }
            count+=x;
        }
        System.out.println("1到"+number+"的阶乘之和为："+count);
    }

    public static void main(String[] args) {
        factorial(10);
    }
}
