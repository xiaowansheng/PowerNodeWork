package day30;

import java.util.Iterator;
import java.util.LinkedList;

public class QQNumber {
    public static void main(String[] args) {
        String[] strs={"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> l=new LinkedList<>();
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()>=5&&strs[i].length()<=11){
                l.add(strs[i]);
            }
        }
        Iterator it=l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("========");
        for(String e:l){
            System.out.println(e);
        }
    }
}
