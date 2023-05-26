package sort;

import java.util.Arrays;

public class Select {
    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 7, 6, 0, 11, 34, 25, 12, 22, 11, 90};
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
