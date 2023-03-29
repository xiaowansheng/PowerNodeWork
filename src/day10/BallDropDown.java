package day10;

public class BallDropDown {
    public static void ballDropDown(double height,int times){//high开始高度，times落下的次数（每次高度都是上一次一半）
        double high=height;
        double distince=0;//单位：米
        for(int i=1;i<times;i++){//times是落地次数
            distince+=(high+high/2);
            System.out.println("第"+i+"次经历的高度为："+(high+high/2));//在这里的次数是：落下弹起算一次。
            high=high/2;//每次落地后弹起的高度
        }
        distince+=high;//前面times-1次，加上最后落下高度一次。
        System.out.println("从"+height+"米高度下落"+"小球在第"+times+"次落地，共经过"+distince+"米");
    }

    public static void main(String[] args) {
        ballDropDown(10,3);
    }
}
