package chenglin.study.algorithm.sort;

/**
 * Created by Mcl on 2017/8/9.
 * 基于数组实现最小堆：
 */
public class MinHeap {

    /**
     * 将节点arr[i]同该元素的父节点作比较，如果小于父节点则交换
     */
    public static void minHeapFixup(int[] arr, int i) {
        int tmp = arr[i];
        int parentIndex = (i - 1) / 2;
        while (parentIndex >= 0 && i != 0) {
            if (arr[parentIndex] <= arr[i]) {
                break;
            }
            arr[parentIndex] = tmp;
            i = parentIndex;
            parentIndex = (i - 1) / 2;
        }
        arr[i] = tmp;
    }

    /**
     * 在最小堆中加入新的数据nNum
     */
    public static void minHeapAddNumber(int[] arr, int n, int nNum) {
        arr[n] = nNum;
        minHeapFixup(arr, n);
    }

    /**
     * 最小堆移除元素arr[i]
     * 移除节点arr[i]同该元素的子节点作比较，如果大于子节点则交换
     */
    public static void minHeapFixdown(int[] arr, int i, int length) {
        int sonIndex = 2 * i + 1;
        int tmp = arr[i];
        while (sonIndex < length) {
            // 从左右孩子找最小的
            if (sonIndex + 1 < length && arr[sonIndex + 1] < arr[sonIndex]) {
                sonIndex++;
            }
            if (arr[sonIndex] >= tmp) {
                break;
            }
            arr[i] = arr[sonIndex];
            i = sonIndex;
            sonIndex = 2 * i + 1;
        }
        arr[i] = tmp;
    }

    /**
     * 在最小堆中删除数
     */
    public static void minHeapDeleteNumber(int[] arr, int n) {
        SortUtils.swap(arr, 0, n - 1);
        minHeapFixdown(arr, 0, n - 1);
    }

    /**
     * 将数组堆化：
     * 由于叶子节点已经是合理的堆了，所以将数组堆化只需考虑n/2-1个父节点
     */
    public static void makeMinHeap(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            minHeapFixdown(arr, i, n);
    }

}
