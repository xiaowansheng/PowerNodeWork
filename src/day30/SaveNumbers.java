package day30;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SaveNumbers {
    public static int[] randoms(){
        int[] numbers=new int[10];
        Random r=new Random();
        for(int i=0;i<numbers.length;i++){
            numbers[i]=r.nextInt(100);
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers=randoms();
        System.out.println("获取的十个随机数为:");
        for(int e:numbers){
            System.out.print(e+" ");
        }
        List<Integer> l=new ArrayList<Integer>();
        for(int e:numbers){
            if(e>=10){
                l.add(e);
            }
        }
        System.out.println();
        System.out.println("List集合中的数为：");
        for(Integer e:l){
            System.out.print(e+" ");
        }
    }
}
