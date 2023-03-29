package day14;

public abstract class Human {
    private String idCard;
    private String name;
    private char sex;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Human(String idCard, String name, char sex) {
        this.idCard = idCard;
        this.name = name;
        this.sex = sex;
    }

    public void speak(){
        System.out.println("我是人！");
    }
}

class Woman extends Human{
    private Man man;

    public Woman(String idCard, String name, char sex) {
        super(idCard, name, sex);
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
        System.out.println("19年了，我终于有男人了！");
    }

    public void speak(){
        System.out.println("我叫"+getName()+"我是个女人。");
    }
}

class Man extends Human{
    private Woman woman;

    public Man(String idCard, String name, char sex) {
        super(idCard, name, sex);
    }

    public Woman getWoman() {
        return woman;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
        System.out.println("20年了，我终于有女人!");
        woman.setMan(this);
    }

    public void speak(){
        System.out.println("我叫"+getName()+"我是个男人。");
    }
}

