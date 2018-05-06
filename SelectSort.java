import java.util.Arrays;

public class SelectSort {
    public static void sort(int[] array){
        for (int i = 0;i<array.length;i++){
            int min = i;
            for (int j = i;j<array.length;j++){
                if (array[j] < array[min])
                    min = j;
            }
            swap(array,i,min);
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
