package src;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        if(arr.length > 2) {
            sort(arr);
        } else{

        }
    }
}
