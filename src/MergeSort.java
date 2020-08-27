
/*
 * @ClassName: MergeSort
 * @Description:
 * @Author: Se7en
 * @Date: 2020/8/26 6:00
 * @Version: 1.0
 */

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("排序结果：" + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] tmp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                tmp[k++] = arr[left++];
            }
            else
                tmp[k++] = arr[right++];
        }

        while (left <= mid) {
            tmp[k++] = arr[left++];
        }

        while (right <= high) {
            tmp[k++] = arr[right++];
        }

        for (int i = 0; i < tmp.length; i++) {
            arr[i + low] = tmp[i];
        }
    }
}
