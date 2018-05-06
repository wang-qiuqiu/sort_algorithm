import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] array,int start,int end){
        if (start == end)
            return;
        int mid = (start + end)/2;
        if (start < end){
            sort(array,start,mid);
            sort(array,mid+1,end);
            merge(array,start,mid,end);
        }
    }

    public static void merge(int[] array,int start,int mid,int end){
        int[] temp = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= end){
            if (array[i] <= array[j])
                temp[k++] = array[i++];
            else
                temp[k++] = array[j++];
        }

        while (i <= mid)
            temp[k++] = array[i++];
        while (j <= end)
            temp[k++] = array[j++];

        for (int x = 0;x<temp.length;x++)
            array[x+start] = temp[x];
    }

    public static void main(String[] args){
        int[] b = {26,53,67,48,57,13,48,32,60,50};
        System.out.println(Arrays.toString(b));
        sort(b,0,b.length-1);
        System.out.println(Arrays.toString(b));
    }
}
