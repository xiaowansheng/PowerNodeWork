package ArrayTools;

public class ArraySearch {
    public static int search(int[] array,int x){//普通查找
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array,int x){//二分查找
        if(array.length<3)
            return -1;
        int begin=0;
        int end=array.length-1;
        while (begin<=end){
            int middle=(begin+end)/2;
            if(x<array[middle]){
                end=middle-1;
            }
            else if(x>array[middle]){
                begin=middle+1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}
