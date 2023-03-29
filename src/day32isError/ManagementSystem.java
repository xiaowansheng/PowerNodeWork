package day32isError;

import java.io.*;
import java.util.*;

//有Bug，且每次增删都是整个集合的保存和写入，所以添加删除效率低，以后需要改进

//学生信息管理系统
public class ManagementSystem {
    //保存学生对象的集合
    public static Map<Integer,InformationStudent> studentsMap=null;
    public static void main(String[] args) {
        //对象输入流
        ObjectInputStream objects=null;
        //对象输出流
        ObjectOutputStream object=null;
        File f=null;
        try {
            f=new File("InformationStudents");
            if(!f.exists()){
                f.createNewFile();
            }
            if(f.length()>4){
                objects=new ObjectInputStream(new FileInputStream(f));
                studentsMap=(Map<Integer,InformationStudent>)objects.readObject();
            }
            else {
                studentsMap=new TreeMap<>();
            }


            //Bug在这里，中间语句执行后没有输出操作就结束，文件数据将归零
            System.out.println("开始字节数:"+f.length());
            object=new ObjectOutputStream(new FileOutputStream(f));
            System.out.println("结束字节数:"+f.length());


            System.out.println("欢迎使用学生信息管理系统，请认真阅读以下使用说明：");
            System.out.println("    请根据不同的功能编号来选择不同功能：");
            System.out.println("    [1]查看学生列表");
            System.out.println("    [2]保存学生");
            System.out.println("    [3]删除学生");
            System.out.println("    [4]查看某个同学详细信息");
            System.out.println("    [0]退出系统");
            Scanner scan=new Scanner(System.in);
            boolean state=true;
            while(state){
                System.out.print("请输入指令选择操作：");
                switch (scan.nextInt()){
                    case 1:
                        viewStudentsInformation();
                        break;
                    case 2:
                        System.out.println("请按顺序依次输入学生对象信息(学号，姓名，性别，年龄，籍贯)：");
                        InformationStudent student=null;
                        int studentId=scan.nextInt();
                        String name=scan.next();
                        char sex=scan.next().charAt(0);
                        int age=scan.nextInt();
                        String nativePlace=scan.next();
                        student=new InformationStudent(studentId,name,sex,age,nativePlace);
                        try {
                            add(student);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        System.out.print("请输入所要删除学生的学号：");
                        try {
                            delete(scan.nextInt());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        System.out.print("请输入所要查看的学生学号：");
                        viewStudentInformation(scan.nextInt());
                        break;
                    case 0:
                        state=false;
                        break;
                    default:
                        System.out.println("指令输入有误！请重新输入...");
                }
                object.writeObject(studentsMap);
            }
            object.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(objects!=null) {
                try {
                    objects.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(object!=null){
                try {
                    object.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("系统已关闭。");
        }
    }

    //查看学生列表
    //需要修改输出控制台格式
    public static void viewStudentsInformation(){
        if(studentsMap.size()==0){
            System.out.println("没有学生对象可以查看！");
            return;
        }
        System.out.println("--------------------------------");
        //System.out.println("学号              姓名            性别        年龄       籍贯                         ");
        Set<Integer> studentIDs=studentsMap.keySet();
        InformationStudent student=null;
        for(Integer e:studentIDs){
            student=studentsMap.get(e);
            System.out.println("学号：["+student.getStudentId()+"] 姓名：["+student.getName()+"] ");
        }
        System.out.println("-----------------------------------");
    }

    //添加学生对象
    public static void add(InformationStudent student) throws IOException {
        studentsMap.put(student.getStudentId(),student);
        System.out.println("已成功添加学号为：["+student.getStudentId()+"]的学生对象。");
    }

    //删除学生对象
    public  static void delete(int studentID) throws IOException {
        if(studentsMap.size()==0){
            System.out.println("学生列表为空！");
        }
        if(studentsMap.get(studentID)==null){
            System.out.println("该学号不存在。");
        }
        else{
            studentsMap.remove(studentID);
            System.out.println("已成功删除学号为：["+studentID+"]的学生对象。");
        }

    }

    //查看某同学详细信息
    public static void viewStudentInformation(int studentID){
        if(studentsMap.get(studentID)==null){
            System.out.println("输入学号有误，学生不存在。");
        }
        else {
            InformationStudent student=studentsMap.get(studentID);
            System.out.println(student);
        }
    }
}
