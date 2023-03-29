package day16;

public class Vehicle {
    private int speed;//速度
    private String type;
    private boolean run;

    public Vehicle(String type,boolean run) {
        this.type=type;
        if(run==true){
            speed=60;
            run=true;
        }
        else{
            speed=0;
            run=false;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void move(){
        speed=60;
        System.out.println("车辆启动，当前速度为："+speed);
    }

    public void speedUp(int a){
        speed+=a;
        System.out.println("车辆速度加："+a+",现在速度为："+speed);
    }

    public void speedDown(int a){
        speed-=a;
        System.out.println("车辆速度减："+a+",现在速度为："+speed);
    }

    public static void main(String[] args) {
        Vehicle car=new Vehicle("smallCar",false);
        car.move();
        car.speedUp(30);
        car.speedDown(20);
    }
}
