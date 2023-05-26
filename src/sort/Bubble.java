package sort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 7, 6, 0, 11, 34, 25, 12, 22, 11, 90};

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
