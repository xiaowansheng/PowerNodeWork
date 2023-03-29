package day21;

import java.util.Objects;

public class Mouse implements InsertDrawable {
    private String name;
    private String type;
    private int capacity;

    public Mouse() {
        name="U盘";
        type="USB2.0";
        capacity=32000;//单位Mb
    }

    public Mouse(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public void work(){
        System.out.println("U盘正在使用中。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mouse mouse = (Mouse) o;
        return capacity == mouse.capacity &&
                name.equals(mouse.name) &&
                type.equals(mouse.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, capacity);
    }

    @Override
    public String toString() {
        return "名字：" + name  + ",类型：" + type + ", 容量：" + capacity;
    }
}
