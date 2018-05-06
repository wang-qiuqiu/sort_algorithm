import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void sort(int[] array,int start,int end){
        if (start >= end)
            return;
        int partition = divide(array,start,end);
        sort(array,start,partition-1);
        sort(array,partition+1,end);
    }

    public static int divide(int[] array,int start,int end){
        int temp = new Random().nextInt(end-start+1)+start;
        swap(array,start,temp);
        int base = array[start];

        while (start < end){
            while (start < end && array[end] >= base)
                end--;
            swap(array,start,end);
            while (start < end && array[start] <= base)
                start++;
            swap(array,start,end);
        }
        return start;
    }

    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args){
        int[] b = {26,53,67,48,57,13,48,32,60,50};
        System.out.println(Arrays.toString(b));
        sort(b,0,b.length-1);
        System.out.println(Arrays.toString(b));
    }
}
