package day30;

import javafx.beans.binding.MapBinding;

import javax.swing.*;
import java.util.*;

public class CountCharacters {
    //统计一个字符串数组中不同字符数量
    public static void countCharacters(List<String> l){
        TreeMap<Character,Integer> tm=new TreeMap<>();
        String[] s=l.toArray(new String[tm.size()]);
        for(int i=0;i<s.length;i++){
            char[] c=s[i].toCharArray();
            for(int j=0;j<c.length;j++){
                if(tm.containsKey(c[j])){
                    tm.put(c[j],tm.get(c[j])+1);
                }
                else {
                    tm.put(c[j], 1);
                }
            }
        }
        Collection<Map.Entry<Character,Integer>> co=tm.entrySet();
        System.out.println("统计的字符数为：");
        for(Map.Entry<Character,Integer> e:co){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("abc");
        l.add("bcd");
        l.add("abcd");
        countCharacters(l);
    }
}
