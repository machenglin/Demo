package chenglin.study.algorithm.sort;

/**
 * Created by Mcl on 2017/8/9.
 */
public class SortUtils {
    /**
     * 交换数组元素
     */
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 打印数组元素
     */
    public static void printArr(int[] arr) {
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
