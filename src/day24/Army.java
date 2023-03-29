package day24;

import day20.Weapon;

public class Army {
    private Weapon[] w;
    private int index;

    public Army(int max) {
        w=new Weapon[max];
        index=-1;
    }

    public void addWeapon(Weapon wa){
        index++;
        w[index]=wa;
    }

    public void attackAll(){
        System.out.println("所有武器开始进攻！");
    }

    public void moveAll(){
        System.out.println("所有可移动武器移动！");
    }
}
