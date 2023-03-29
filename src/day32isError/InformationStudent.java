package day32isError;

import java.io.Serializable;

//学生信息管理系统
public class InformationStudent implements Serializable {
    //给定序列化版本号
    private static long serialVersionUID=2018313869L;//序列化版本号

    private int studentId;//学号
    private String name;//姓名
    private char sex;//性别
    private int age;//年龄
    private String nativePlace;//籍贯

    public InformationStudent(int studentId, String name, char sex, int age, String nativePlace) {
        this.studentId = studentId;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.nativePlace = nativePlace;
    }

    public InformationStudent(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" +
                "学号=" + studentId +
                ", 姓名='" + name + '\'' +
                ", 性别=" + sex +
                ", 年龄=" + age +
                ", 籍贯='" + nativePlace + '\'' +
                ']';
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }
}
