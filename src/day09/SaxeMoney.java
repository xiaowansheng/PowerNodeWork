package day09;

public class SaxeMoney {
    public static void saveMoney(){
        int count=0;
        double i=0;
        for(i=2.5;i<=100;i+=2.5){
            count++;
            if(count%5==0)
                i-=6;
        }
        System.out.println("存100元需要："+count+"天。这天总共存了："+i+"元。");
    }
    public static void main(String[] args) {
        saveMoney();
    }
}
