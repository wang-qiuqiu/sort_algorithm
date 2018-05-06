import java.util.Arrays;

public class InsertSort {
    public static void sort(int[] array){
        for (int i = 1;i<array.length;i++){
            int base = array[i];
            int j = i;
            for (;j > 0 && array[j-1] > base;j--)
                array[j] = array[j-1];
            array[j] = base;
        }
    }

    public static void main(String[] args){
        int[] b = {26,53,67,48,57,13,48,32,60,50};
        System.out.println(Arrays.toString(b));
        sort(b);
        System.out.println(Arrays.toString(b));
    }
}
