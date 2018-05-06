import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] array){
        for (int i = array.length-1;i>0;i--){
            for (int j = 0;j<i;j++){
                if (array[j] > array[j+1])
                    swap(array,j,j+1);
            }
        }
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
