package day30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CompareSort {
    public static void main(String[] args) {
        Student[] s={
                new Student("liusan",20,90.0f),
                new Student("lisi",22,90.0f),
                new Student("wangwu",20,99.0f),
                new Student("sunliu",22,100.0f)};
        ArrayList<Student> arr=new ArrayList<>();
        for(Student e:s){
            arr.add(e);
        }
        System.out.println("未排序输出：");
        for(Student e:arr){
            System.out.println(e);
        }
        System.out.println("排序输出（Comparetor）:");
        Collections.sort(arr,new Student.CompareSort());
        //arr.sort(new Student.CompareSort());
        for(Student e:arr){
            System.out.println(e);
        }
        System.out.println("排序输出（Comparable）");
        Collections.sort(arr);
        for(Student e:arr){
            System.out.println(e);
        }
    }
}
class Student implements Comparable<Student>{
    private String name;
    private int age;
    private float grade;

    public Student(String name, int age, float grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
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

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student student) {
        if(grade==student.grade){
            return age-student.age;
        }
        else{
            return (int)(student.grade-grade);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public static class CompareSort implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if(o1.grade==o2.grade){
                return o1.age-o2.age;
            }
            else{
                return (int)(o2.grade-o1.grade);
            }
        }
    }
}
