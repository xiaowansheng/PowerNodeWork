package day19;

public class Person {
    private String name;
    private int age;
    private String sex;
    private String vorus;

    public String getVorus() {
        return vorus;
    }

    public void setVorus(String vorus) {
        this.vorus = vorus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void ill(){

        if(name!=null&&age!=0&&sex!=null)
            System.out.println(name+","+sex+","+age+",生病了。");
        else {
            System.out.println("生病了。");
        }
    }

    public void illReason(){
        System.out.println(vorus+"感染，快死了.");
    }

    public static void main(String[] args) {
        Person person=new Person("憨憨",19,"男");
        Virus virus=new Virus("新冠病毒","small","病毒");
        virus.attack(person);
        person.illReason();
    }
}
