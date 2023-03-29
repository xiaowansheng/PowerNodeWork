package ArrayTools;

public class ArraySort {
    public static void bubbleSort(int[] array) {//冒泡排序
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
        }
    }

    public static void selectionSort(int[] array) {//选择排序
        if (array.length < 1)
            return;
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            if (array[index] < array[i]) {
                int x = array[index];
                array[index] = array[i];
                array[i] = x;
            }
        }
    }
}
