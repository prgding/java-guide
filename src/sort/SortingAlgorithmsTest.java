package sort;

import java.util.Arrays;

public class SortingAlgorithmsTest {
    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 7, 6, 0, 11, 34, 25, 12, 22, 11, 90};

        System.out.println("原始数组: " + Arrays.toString(arr));

        int[] testArr = Arrays.copyOf(arr, arr.length);
        SortingAlgorithms.bubbleSort(testArr);
        System.out.println("冒泡排序结果: " + Arrays.toString(testArr));

        testArr = Arrays.copyOf(arr, arr.length);
        SortingAlgorithms.selectionSort(testArr);
        System.out.println("选择排序结果: " + Arrays.toString(testArr));

        testArr = Arrays.copyOf(arr, arr.length);
        SortingAlgorithms.insertionSort(testArr);
        System.out.println("插入排序结果: " + Arrays.toString(testArr));
    }
}
