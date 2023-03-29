package day20;

public abstract class Equipment implements Weapon {
    private int lifeVaule;//生命值
    private int damage;//攻击力

    public int getLifeVaule() {
        return lifeVaule;
    }

    public void setLifeVaule(int lifeVaule) {
        this.lifeVaule = lifeVaule;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack(Equipment target){};
    public void beingAttact(int injured){};
    public void move(){};
}
