package day20;

public class Tank extends Equipment implements Weapon{
    private int lifeVaule;//生命值
    private int damage;//攻击力

    public Tank() {
        lifeVaule=5000;
        damage=400;
    }
    public void attack(Equipment target){
        System.out.println("坦克发起进攻。");
        if(lifeVaule<=0){
            System.out.println("坦克被销毁。");
            return;
        }
        target.beingAttact(damage);
    }

    public void beingAttact(int injured){
        lifeVaule-=injured;
        System.out.println("坦克受到攻击，生命值减少："+injured+"，剩余生命值："+lifeVaule);
    }

    public void move(){

    }
}
