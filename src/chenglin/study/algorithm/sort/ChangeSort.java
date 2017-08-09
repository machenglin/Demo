package chenglin.study.algorithm.sort;

/**
 * Created by Mcl on 2017/8/8.
 * 交换排序：冒泡排序，快速排序
 */
public class ChangeSort {

    /**
     * 冒泡排序
     */
    public static void bubbleSortDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    SortUtils.swap(arr, i, j);
                }
            }
        }
    }

    /**
     * 快速排序
     * 基本思想：
     * 1、先从数列中取出一个数作为基准数。
     * 2、分区过程，把比基准数X小的放在左边，比基准数X大的放在右边。
     * 3、再对左右区间重复第二步，直到各区间只有一个数。
     */
    public static void quickSortDesc(int[] arr, int left, int right) {
        if (left < right) {
            int i = left, j = right, x = arr[left];
            while (i < j) {
                // 从右向左找大于或等于x的数来填arr[i]
                while (i < j && arr[j] < x) {
                    j--;
                }
                if (i < j) {
                    arr[i++] =arr[j];
                }
                // 从左向右找小于x的数来填arr[j]
                while (i < j && arr[i] >= x) {
                    i++;
                }
                if (i < j) {
                    arr[j--] =arr[i];
                }
            }
            arr[i] = x;
            // 到这步，i左边都是比基准数x大的数列，右边都是比基准数小x的数列
            // 这里可以用分而治之的思想，对左右两边的数列继续上面的操作，直到各区间只有一个数。
            quickSortDesc(arr, left, i - 1);
            quickSortDesc(arr, j + 1, right);
        }
    }

}
