package day20;

public class WeaponTest {
    public static void main(String[] args) {
        Tank tank=new Tank();
        Flighter flighter=new Flighter();
        Warship warship=new Warship();
        tank.attack(flighter);
        warship.attack(flighter);
        tank.attack(warship);
        warship.attack(flighter);
        warship.attack(flighter);
        warship.attack(flighter);
    }
}
