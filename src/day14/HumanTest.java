package day14;
//Human里做过
public class HumanTest {
    public static void main(String[] args) {
        Woman woman=new Woman("5301812001","花花",'女');
        Man man=new Man("5301812000","憨憨",'男');
        woman.speak();
        man.speak();
        man.setWoman(woman);
    }
}
