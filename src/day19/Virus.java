package day19;

public class Virus {
    private String name;
    private String size;
    private String type;

    public Virus(String name, String size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public Virus() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void attack(Person person){
        System.out.println("病毒开始攻击人了。");
        person.setVorus(name);
        person.ill();
    }
}
