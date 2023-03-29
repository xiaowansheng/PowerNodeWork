package day10;

public class EatPeach {
    public static void eatPeach(int day){/*day是吃到的天数，到day天剩一个。求桃子数。*/
        //(x-x/2-1)-((x-x/2-1)/2-1)-...
        int peach=1;
        for(;day>1;day--){
            peach=peach*2+1;
        }
        System.out.println("猴子第一天摘了"+peach+"个桃子。");
    }

    public static  void dayTotal(int peach){//peach是桃子数量，每天吃剩下的一半加一个。求天数。
        int day=0;
        for(day=1;peach>1;day++){
            peach=peach/2-1;
        }
        System.out.println("吃到第"+day+"天，剩余桃子"+peach);
    }

    public static void main(String[] args) {
        eatPeach(10);
        dayTotal(2023);
    }
}
