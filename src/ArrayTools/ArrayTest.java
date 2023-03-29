package ArrayTools;


//测试类
public class ArrayTest {
    public static void main(String[] args) {
        int[] a={9,8,7,6,5,2,3,1,0};
        //ArraySort.bubbleSort(a);
        ArraySort.selectionSort(a);
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
        int x=6;
        System.out.println("排序后，x的下标为："+ ArraySearch.binarySearch(a,6));
    }
}
