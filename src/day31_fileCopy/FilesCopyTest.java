package day31_fileCopy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FilesCopyTest {
    public static void main(String[] args) {
        Scanner path=new Scanner(System.in);
        System.out.println("请输入拷贝源路径：");
        String source=path.next();
        System.out.println("请输入目标路径：");
        String destination=path.next();
        long b=0;
        long e=0;
        Date begin=null;
        Date end=null;
        //开始时间
        b=System.currentTimeMillis();
        begin=new Date(b);
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println("开始拷贝。时间："+s.format(begin));
        try {
            //调用拷贝函数
            FilesCopy.filesCopy(source,destination);
        } catch (FileCopyErrorException ex) {
            ex.printStackTrace();
        }
        //结束时间
        e=System.currentTimeMillis();
        end=new Date(e);
        System.out.println("拷贝完成。时间："+s.format(end));
        System.out.println("拷贝总大小："+FilesCopy.byteSum/1024+"Kb");
        System.out.println("用时："+(double)(e-b)/1000+"秒");
    }
}
