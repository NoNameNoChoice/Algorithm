
/*
 * @ClassName: QuickSort
 * @Description:
 * @Author: Se7en
 * @Date: 2020/8/26 2:30
 * @Version: 1.0
 */

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[] {9,4,6,8,3,10,4,6};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low;
        int right = high;

        if (low >= high) {
            return;
        }

        while (left < right) {
            while (pivot <= arr[right] && left < right) {
                right--;
            }

            while (pivot >= arr[left] && left < right) {
                left++;
            }
            swap(arr, left, right);
        }
        swap(arr, low, left);
        quickSort(arr, low, left - 1);
        quickSort(arr, left + 1, high);
    }

    public static void swap(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }

        arr[left] = arr[left] + arr[right];
        arr[right] = arr[left] - arr[right];
        arr[left] = arr[left] - arr[right];
    }
}
