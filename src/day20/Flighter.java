package day20;

public class Flighter extends Equipment implements Weapon{
    private int lifeVaule;//生命值
    private int damage;//攻击力

    public Flighter() {
        lifeVaule=3000;
        damage=800;
    }

    public void attack(Equipment target){
        System.out.println("飞机发起进攻。");
        target.beingAttact(damage);
    }

    public void beingAttact(int injured){
        lifeVaule-=injured;
        if(lifeVaule<=0){
            System.out.println("飞机被销毁。");
            return;
        }
        System.out.println("飞机受到攻击，生命值减少："+injured+"，剩余生命值："+lifeVaule);
    }
    public void move(){

    }
}
