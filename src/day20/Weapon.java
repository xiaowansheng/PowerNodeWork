package day20;

public abstract interface Weapon {
    public abstract void attack(Equipment target);
    public abstract void beingAttact(int injured);
    public abstract void move();
}
