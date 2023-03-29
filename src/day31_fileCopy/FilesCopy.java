package day31_fileCopy;

import java.io.*;
import java.util.Scanner;

public class FilesCopy {
    //记录拷贝的字节数
    public static long byteSum=0;
    //文件拷贝函数，可以拷贝文件、文件夹。
    //传入两个参数，一个源路径，一个目标路径。
    public static void filesCopy(String sourceFiles,String destinationFile) throws FileCopyErrorException {
        //源文件（文件夹）
        File source=new File(sourceFiles);
        //目标文件夹
        File destination=new File(destinationFile);
        if(!source.exists())
            throw new FileCopyErrorException("源文件不存在！");
        if(destination.isDirectory()&&!destination.exists())
            throw new FileCopyErrorException("目标目录不存在！");
        //判断是文件
        if(source.isFile()){
            FileInputStream fi=null;
            FileOutputStream fo=null;
            File fileSource=source;
            File fileDestination=new File(destination+"\\"+source.getName());
            //判断文件是否存在，不存在创建，存在则选择操作
            if(!fileDestination.exists()){
                try {
                    fileDestination.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //若文件存在，则手动选择操作
            else {
                System.out.println("文件已存在！");
                Scanner choose=new Scanner(System.in);
                System.out.println("输入:\"1\"进行覆盖,\"2\"跳过,\"0\"取消拷贝。");
                System.out.print("请选择操作：");
                switch (choose.nextInt()){
                    case 0:
                        throw new FileCopyErrorException("取消拷贝。");
                    case 1:
                        break;
                    case 2:
                        return;
                }
            }
            try {
                fi=new FileInputStream(fileSource.getAbsolutePath());
                fo=new FileOutputStream(fileDestination.getAbsolutePath());
                //拷贝数据
                byte[] b=new byte[1024*1024];//1Mb
                int readCount=0;
                //每次循环最多拷贝1Mb
                while((readCount=fi.read(b))!=-1){
                    fo.write(b,0,readCount);
                    byteSum+=readCount;
                }
                fo.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(fi!=null){
                    try {
                        fi.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(fo!=null){
                    try {
                        fo.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        //不是文件就肯定是文件夹
        File fileSource=source;
        File fileDestination=new File(destination+"\\"+fileSource.getName());
        //文件夹不存在，创建文件夹
        if(!fileDestination.exists())
            fileDestination.mkdirs();
        //如果存在，则手动选择操作
        else{
            System.out.println("文件夹已存在。");
            Scanner choose=new Scanner(System.in);
            System.out.println("输入:\"1\"进行覆盖,\"2\"跳过,\"0\"取消拷贝。");
            System.out.print("请选择操作：");
            switch (choose.nextInt()){
                case 0:
                    throw new FileCopyErrorException("取消拷贝。");
                case 1:
                    break;
                case 2:
                    return;
            }
        }
        //完成文件夹复制
        File[] files=source.listFiles();
        if(files==null){
            return;
        }
        for(File e:files){
            filesCopy(e.getAbsolutePath(),fileDestination.getAbsolutePath());
        }
    }
}
