package day32isError;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.TreeMap;

public class StudentsManageTest {
    public static void main(String[] args) {
        //创建五个学生对象
        InformationStudent student1=new InformationStudent(2018313,"憨憨1号",'男',19,"云南昆明");
        InformationStudent student2=new InformationStudent(2018314,"憨憨2号",'女',20,"云南曲靖");
        InformationStudent student3=new InformationStudent(2018315,"憨憨3号",'男',20,"云南西双版纳");
        InformationStudent student4=new InformationStudent(2018316,"憨憨4号",'女',19,"云南玉溪");
        InformationStudent student5=new InformationStudent(2018317,"憨憨5号",'男',21,"云南大理");
        //创建集合
        Map<Integer,InformationStudent> students=new TreeMap<>();
        //添加学生对象
        students.put(student1.getStudentId(),student1);
        students.put(student2.getStudentId(),student2);
        students.put(student3.getStudentId(),student3);
        students.put(student4.getStudentId(),student4);
        students.put(student5.getStudentId(),student5);
        //创建对象流
        ObjectOutputStream o=null;
        try {
            o=new ObjectOutputStream(new FileOutputStream("InformationStudents"));
            //序列化集合
            o.writeObject(students);
            o.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(o!=null){
                try {
                    o.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
