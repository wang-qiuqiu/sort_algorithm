import java.util.Arrays;

public class HeapSort {
    public static void sort(int[] array){
        int length = array.length-1;
        adjustHeap(array,length/2,length);
        for (int i = length;i>0;i--){
            swap(array,0,i);
            adjustHeap(array,i/2-1,i-1);
        }
    }

    public static void adjustHeap(int[] array,int start,int len){
        if (start == -1)
            return;
        int max = start;
        int left = 2*start+1;
        int right = 2*start+2;

        if (left <= len && array[left] > array[max])
            max = left;
        if (right <= len && array[right] > array[max])
            max = right;
        swap(array,start,max);
        start--;
        adjustHeap(array,start,len);
    }
    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args){
        int[] b = {26,53,67,48,57,13,48,32,60,50};
        System.out.println(Arrays.toString(b));
        sort(b);
        System.out.println(Arrays.toString(b));
    }

}
