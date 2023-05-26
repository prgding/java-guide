package sort;

public class SortingAlgorithms {
    // 冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // 选择排序
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }
    }

    // 插入排序
    public static void insertionSort(int[] arr) {
        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {
            // 记录要插入的数据
            int insertion = arr[i];

            // 如果左侧值大于insertion
            int j = i - 1;
            while (j >= 0 && arr[j] > insertion) {
                // 左侧值往右移动
                arr[j + 1] = arr[j];
                // 从右向左比较，索引向左移动
                j--;
            }

            // 存在比其小的数，插入
            if (j != i - 1) {
                arr[j + 1] = insertion;
            }
        }
    }

    // 交换
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
